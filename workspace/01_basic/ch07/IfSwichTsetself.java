package ch07;

//등급 1 (새싹 회원): 할인 없음 (0.0)
//등급 2 (고마운 회원): 5% 할인 (0.05)
//등급 3 (귀한 분 회원): 10% 할인 (0.1)
//등급 4 (더 귀한 분 회원): 15% 할인 (0.15)
//등급 5 (천생연분 최고 등급): 20% 할인 (0.2)
//가격 30000


public class IfSwichTsetself {
    public static void main(String[] args){
        int price = 30000; // 정상가
        String grade = "등급4"; // 회원등급
        double discountRate = 0; // 할인율(%)
        int lastprice = price; // 할인가

        //if문
//        if(grade == "등급1"){
            discountRate = 0;
//        }else if (grade== "등급2") {
//            discountRate = 0.05;
//        }else if (grade== "등급3") {
//            discountRate = 0.1;
//        }else if (grade== "등급4") {
//            discountRate = 0.15;
//        }else if (grade== "등급5") {
//            discountRate = 0.2;
//        }

        // switch
        switch (grade) {
            case "등급1":
                discountRate = 0;
                break;
            case "등급2":
                discountRate = 0.03;
                break;
            case "등급3":
                discountRate = 0.11;
                break;
            case "등급4":
                discountRate = 0.19;
                break;
            case "등급5":
                discountRate = 0.22;
                break;

        }


        lastprice = (int)(price * (1 - discountRate));

        System.out.println("회원님은" + grade + "이므로 정상가"
                + discountRate + "% 할인된 가격" + lastprice + "원 입니다.");





    }
}
