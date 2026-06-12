package ch07;

// 정상가: 50000
// 나이 기본 할인
// 13세 이하 어린이 50% 할인
// 65세 이상 어르신 70% 할인
// 입장 시간 및 요일 특별 할인
// "야간" 요일 상관없이 30% 할인
// 둘중 하나만 할인가능
// 나이 할인이 안되는 고객은 요일 할인만 가능

public class IfSwichTestself2 {
    public static void main(String[] args){

        int price = 50000; // 정상가
        int age = 13; // 사용자 나이
        double discountRate = 0.0; // 할인율
        String evening = "야간"; // 할인 30%
        int lastprice = price; //할인 적용가

        if(age <= 13)
        {discountRate = 50;
            }else if (age >= 65){
            discountRate = 70;
            }else if (evening == "야간"){
            discountRate = 30;}

        lastprice = (int)(price * (1-discountRate / 100));

        if(age <= 13 || age >= 65){
            System.out.println("고객님은" + age + "살 이므로 정상가"
            + discountRate + "% 할인된 가격" + lastprice + "원 입니다.");
        }else {
            System.out.println(
                "고객님은" + age +"살 이므로 정상가에서 "+ evening + discountRate +
                 "% 할인된 가격 " + lastprice + "입니다");
        }



        }



    }


