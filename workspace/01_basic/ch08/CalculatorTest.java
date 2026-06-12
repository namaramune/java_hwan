package ch08;

import java.util.Scanner;

// 계산기
// 5+4-> 5+4=9
// 4*2-> 4*2=8
public class CalculatorTest {
    public static void main(String[] args){
        // 이 프로그렘 이름
        System.out.println("*** 계산기 프로그렘 ***");
        // 계산기 사용법
        System.out.println("계산식을 입력하세요.(예시, 5 + 4)");
        // Run 프로그렘에서 입력하게하기
        Scanner s = new Scanner(System.in);
        // 정수 입력?
        int num1 = s.nextInt(); // 5
        // 문자열 입력
        String operator = s.next(); // "+"
        // 정수 입력
        int num2 = s.nextInt();// 4
        //
        String result = switch (operator){
            // 더하기를 식을 구하기 위한
            case "+" -> num1 + " " + operator + " " + num2 + " = " + (num1 + num2); //문자열은 깡패 여서 누구랑 붙든 문자로 바뀜
            case "-" -> num1 + " " + operator + " " + num2 + " = " + (num1 - num2);
            case "*" -> num1 + " " + operator + " " + num2 + " = " + (num1 * num2);
            case "/" -> num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2);
            default -> "수식에 오류가 있습니다.";
        };
        System.out.println(result);
    }
}
