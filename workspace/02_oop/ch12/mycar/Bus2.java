package ch12.mycar;

public class Bus2 extends Car {
    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 광역버스, 마을버스 ...
    private String[] stations; // 노선
    private int station; // 현재 위치
    private final int price; // 승차비
    private int maxPassenger; // 최대 승객수
    private int money; // 현재까지의 수익
    private int totalPassenger; // 총 승차 인원
    private static int totalMoney; // 운영하는 모든 버스의 수익
    private int temp; // 할인이 적용된 가격

    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
    //    Bus(){ super(); }

    public Bus2(String model, String no, String type
            , String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
    }

    private double calPrice(int agePrice) {
        double calPrice = 1;
        if (agePrice == 1) { // 어린이
            calPrice = 0.5;
            System.out.println("어린이 할인 50% 적용되었습니다");
        } else if (agePrice == 2) {// 청소년
            calPrice = 0.7;
            System.out.println("청소년 할인 30% 적용되었습니다");
        } else if (agePrice == 4) { // 노인
            calPrice = 0;
            System.out.println("노인 우대가 적용 되었습니다.");
        }
        return calPrice;
    }

    private int busPay(int payType) {
        temp = price;
        int discount = 0;
        if (payType == 1) { // 교통카드
            discount = 100;
        } else if (payType == 3) { // 지역카드
            discount = 200;
        }
        temp -= discount;
        return discount;
    }
        // 승차합니다.
    void ride ( int agePrice, int payType ){
        // 수익 증가
        // agePrice = 1. 어린이 / 2. 청소년 / 3. 성인 / 4. 노인별 할인율 적용해서 할인
        // payType = 1. 교통카드 / 2. 현금 / 3. 지역카드 (지역 주민 할인, 특정 카드 이용시 할인)
        if (passengerCount >= maxPassenger) {
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 타세요.");
            return;
        }
        // ageGroup 연령별 할인율
        String ageName = "성인";
        if (agePrice == 1) {
            ageName = "어린이";
        } else if (agePrice == 2) {
            ageName = "청소년";
        } else if (agePrice == 4) {
            ageName = "노인";
        }

        int discount = busPay(payType);

        double discountRate = calPrice(agePrice);
        temp *= discountRate;

        // 결제수단 payType

        String payName = "현금";
        if (payType == 1) { // 교통카드
            payName = "교통카드";
        } else if (payType == 3) { // 지역카드
            payName = "지역카드";
        }

        // 정산
        passengerCount++;
        totalPassenger++;
        this.money += temp;
        Bus2.totalMoney += temp;
        if (payType == 2){
            System.out.println(ageName + " 1명이 승차하였습니다." + temp + " 원 입니다.");
        } else {
            if (agePrice == 4) {
                System.out.println(ageName + " 1명이 승차하였습니다." + temp + " 원 결제 되었습니다.");
            } else {
                System.out.println(ageName + " 1명이 승차하였습니다." + payName + " 결제, " + temp + " 원 결제 되었습니다.");
            }
        }
        System.out.println("-----------------------------------------");
    }


    // 하차합니다.
//    void leave () {
//        passengerCount--;
//        System.out.println("1명이 하차합니다.");
//    }
    void leave (int amount) {
        if (passengerCount != 0) {
            if (amount > passengerCount){
                amount = passengerCount;
            }
            passengerCount -= amount;
            System.out.println(amount + " 명이 하차합니다.");
        }
    }

    // 오버라이딩: 부모 메서드를 자식이 재정의
    void stop () {
        super.stop(); // 부모의 stop() 메서드 호출
        station++;
        if (station == stations.length) {
            station = 0;
        }
        System.out.println("이번역은 " + stations[station] + "역 입니다.");
    }

    // 기다리는 버스가 몇 정거장 전에 있는가?
    int getStationsLeft () {
        int result = 0;
        return result;
    }

    // 버스의 현재 상태를 출력합니다.
    String getBusInfo () {
        return "\n=================================\n"
                + "[버스 정보] 번호: " + no + ", 종류: " + type + ", 현재 위치: " + stations[station] + "\n"
                + "[좌석 상태] 현재 탑승객: " + passengerCount + "명 (남은 좌석: " + (maxPassenger - passengerCount) + "석)\n"
                + "---------------------------------\n"
                + "💰 이 버스의 오늘 수익: " + this.money + "원 (총 " + this.totalPassenger + "명 탑승)\n"
                + "🏢 모든 버스 총 수입 합계: " + Bus2.totalMoney + "원\n"
                + "=================================";
    }
}

