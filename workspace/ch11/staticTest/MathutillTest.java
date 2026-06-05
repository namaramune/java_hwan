package ch11.staticTest;

public class MathutillTest {

    void add10(int n1){
        System.out.println(n1 + 10);
    }

    int n2 = 20;
    void addN2(int n1){
        System.out.println(n1 + n2);
    }

    public static void main(String[] args){
//        MathUtill m = new MathUtill();
//        m.PI = 3.14; // 상수이기 때문에 수정은 안됨

        // 반지름 5인 원이 넓이는 xx입니다.
        double area = MathUtill.PI * 5 * 5;
        System.out.println("반지름 5인 원의 넓이는 " + area + "입니다.");

        System.out.println("3 + 5 = " + MathUtill.add(3, 5));

//        MathUtill.area();
    }
}
