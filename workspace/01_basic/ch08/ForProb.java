package ch08;

public class ForProb {
    public static void main(String[] args) {
        int num = 100; // 번호 100까지
        int sum = 0; // 합계는 미지정

        //1~100 합계
        for (int i = 1; i <= num; i++) {// 위해서 정수 i = 1, i는 num보다 작거나 같다, i에 1을 더해라
            sum += i; // sum은 i를 더한값이다
            System.out.println("1부터 100까지의 합계:" + sum); // 1부터 100까지의 합계: sum의 값
        }
        //1~100 홀수 합계
        int oddSum = 0; // 정수 홀수 는 미지정
        for (int i = 1; i <= num; i++) { // 위해서 정수i 는 1과 같다. i는 num보다 작거나 같다. i에 1을 더해라
            if (i % 2 == 1) { // 만약 i나누기 2의 나머지는 1
                oddSum += i; // 홀수 는 i를 더한 값이다.
            }
        }
        System.out.println("1부터 100까지의 홀수 합계: " + oddSum); // 1부터 100까지의 홀수 합계: 홀수의 합계
        //1~100 짝수 합계
        int evenSum = 0; // 정수 짝수는 미지정
        for (int i = 1; i <= num; i++) { // 위해서 정수 i 는 1이다, i 는 num보다 작거나 같다. i에 1을 더해라
            if (i % 2 == 0) { // 만약 i나누기 2의 나머지는 0
                evenSum += i; // 짝수는 i를 더한 값이다.
            }
        }
        System.out.println("1부터 100까지의 짝수 합계: " + evenSum);// 1부터 100까지의 짝수 합계: 짝수의 합계
    }
}

