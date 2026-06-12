package ch05;

public class PrimitiveType {
    void main(){
        int age; // 변수 선언
        age = 25; // 변수에 값 할당
        System.out.println(age);
        age = 30; // 변수에 값을 재할당
        System.out.println(age);

        int score = 100; // 3. 변수 선언과 동시에 값 할당
        System.out.println(score);

        byte b = 127;
        System.out.println(b);

        short s = 10000;
        System.out.println(s);

        int num = 10000000;
        System.out.println(num);

        float shortPi = 3.14F;
        System.out.println(shortPi);

        boolean isGood = true;
        System.out.println(isGood);

        boolean isMan = false;
        System.out.println(isMan);

        char grade = 'A';
        System.out.println(grade);

        grade = 'B';
        System.out.println(grade);

        // 문자열2: 2글자이상의 문자들을 저장
        // 큰다음표로 문자를 묶어서 표현
        String fistName = "멋쟁이";
        String lastName = "사자처럼";
        System.out.println(fistName);
        System.out.println(lastName);

        double pi2 = 3.14;

        // 반지름이 5인 원의 널이를 계산
        System.out.println(pi2*5*5);


        //반지름이 4인 원의 넓이를 계산
        System.out.println(pi2*4*4);

        }
    }
