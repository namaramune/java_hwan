package ch08;

public class ForSolve {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;

        //1~100 합계
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.println("1부터 100까지의 합계:" + sum);
        }
        //1~100 홀수 합계
        int oddSum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("1부터 100까지의 홀수 합계: " + oddSum);
        //1~100 짝수 합계
        int evenSum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("1부터 100까지의 짝수 합계: " + evenSum);
    }
}
