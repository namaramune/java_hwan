package ch11.staticTest;

public class MathUtill {
    // 상수
    final static double PI= 3.13159; // Static 필드
    int r = 5; // 인스턴스 필드

    // 원의 반지름을 구한다.
    static void area(){
        // static 매서드에서는 static 필드나 static 매서드만 사용가능
//        System.out.println(PI * r * r);
    }

    // 매서드 내부에서 인스터스 필드나 인스턴스 매서드를 사용하지 않을 경우에 static을 붙이면 된다.
    static int add(int n1, int n2){
        return n1 + n2;
    }
}
