package ch07;

// 나이에 따른 입장료 할인을 계산하는 프로그렘을 작성하세요.
// 7세 이하: 영유아 100% 할인
// 8 ~ 13: 어린이 50% 할인
// 14 ~ 19: 청소년 30% 할인
// 65세 이상: 70% 할인
public class IfSwichTest {
    public static void main(String[] args){
        int age = 7; // 나이
        int price = 20000; // 정상가
        double discountRate = 0.0; // 할인율(30% 할인의 경우 0.3)
        int lastprice = price; // 할인가

        //요금을 계산하세요.

        //if문

        if(age <= 7)
        {
            discountRate = 1.0;
        } else if (age <= 13 ){
            discountRate = 0.5;
        } else if (age <= 19 ){
            discountRate = 0.3;
        } else if (age >= 65 ){
            discountRate = 0.7;
        } else {}

        // switch문
        switch (age){
            case 1, 2, 3, 4, 5, 6, 7:
                discountRate = 1.0;
                break;
            case 8, 9, 10, 11, 12, 13:
                discountRate = 0.5;
                break;
            case 14, 15, 16, 17, 18, 19:
                discountRate = 0.3;
                break;
            case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40:
                discountRate = 0;
                break;
            default:
                discountRate = 0.7;

        }


        lastprice = (int) (price * (1 - discountRate));

        System.out.println("나이가 " + age + "세 이므로 할인율 "
                + discountRate*100 +" %가 적용되어 요금은 " + lastprice + "원 입니다.");


    }
}
