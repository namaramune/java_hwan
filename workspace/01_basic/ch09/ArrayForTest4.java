package ch09;

import java.util.Scanner;

// 구구단 출력 (결과를 배열로 저장 후 출력)
public class ArrayForTest4 {
    public static void main(String[] args) {
        System.out.println("단을 입력하세요");
        Scanner s = new Scanner(System.in);// 사용자의 입력을 받을때 사용
        int dan = s.nextInt(); // Run에 입력한 값을 int로 꺼내옴
        System.out.println("입력한 단" + dan); // 입력한 숫자를 화면에 표시

        int[] result = new int[9]; // 9까지 곱셈

// i=1, i<=9 9이하 까지 증가 가능, i = 1씩 올라감
        for (int i = 0; i < result.length; i++) {//i 는 new int 10까지 증가
            result[i] = dan * (i+1);// dan=3, i=0, result[0]=3*1, result[1]=3*2, i=2 result[2]=3*3...
//            System.out.println(dan + " x " + i + " = " + (dan * i)); // ?단 x i = ?xi // ?단을 다 보여줌
        }

        System.out.println(dan + "단 학습 완료!");

        //0을 입력할 때까지 무한으로 반복하도록 작성하세요.
        int num = s.nextInt();
        while (num !=0){
            System.out.println("곱할 숫자를 입력 하세요. 0을 입력하면 종료 됩니다.");
            System.out.println(dan + " x " + num + " = " + result[num-1]);
            num = s.nextInt();
        }

        System.out.println("구구단 종료.");
    }
}
