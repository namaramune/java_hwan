package ch08;

import java.util.Scanner;

// 구구단 출력
public class ForTest4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);// 사용자의 입력을 받을때 사용
        int dan = s.nextInt(); // Run에 입력한 값을 int로 꺼내옴
        System.out.println("입력한 값" + dan);
// i=1, i<=9 9이하 까지 증가 가능, i = 1씩 올라감
        for (int i=1; i<=9; i++){
            // run에 입렵한 값 * 증가하는 i 값 =
            // run에 입력한 값 * 증가하는 i 와 곱한 값을 출력해라
            System.out.println(dan + " x " + i + " = " + (dan*i));
        }

    }
}
