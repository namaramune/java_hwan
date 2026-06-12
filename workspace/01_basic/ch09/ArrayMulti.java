package ch09;

public class ArrayMulti {
    public static void main(String[] args){
        // 1. 다차원 배열(2행 3열)
        int[][] matrix = new int[2][3];
        matrix[0][1] = 10;
        matrix[1][2] = 20;

        // 2. 다차원 배열 생성 (초기화와 동시에) - 가변 배열 형태
        int[][] matrix2 = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90, 100}
        };

        // 3. 배열의 모든 요소 출력 (일반 중첩 for문)
        System.out.println("=== 일반 중첩 for문 출력 ===");
        for (int i=0; i<matrix2.length; i++){
            for (int k=0; k<matrix2[i].length; k++){
                System.out.println("i:" + i + ", k:" + k + " -> " + matrix2[i][k]);
            } // 안쪽 for문 끝
        } // 바깥쪽 for문 끝


        // 4. 향상된 for 문 (바깥쪽 for문이 완전히 끝난 후 실행되도록 분리)
        System.out.println("\n=== 향상된 for문 출력 ===");
        for (int[] numArray : matrix2){      // 1차원 배열을 하나씩 꺼냄 (총 3회 반복)
            for (int num : numArray){        // 꺼낸 배열에서 요소를 하나씩 꺼냄
                System.out.println(num);
            } // 안쪽 향상된 for문 끝
        } // 바깥쪽 향상된 for문 끝

    } // main 메서드 끝
} // class 끝