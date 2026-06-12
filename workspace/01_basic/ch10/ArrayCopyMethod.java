package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {

    // 전달받은 배열의 모든 요소를 출려
    void printArr(int[] arr, String name) {
        System.out.print(name + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(name + ": " + arr[i]);
        }
    }


        public static void main(String[] args){
            // 1.얇은 복사

            int[] original = {10, 20, 30};
            int[] shallow = original; // orginal을 복사함

            // original, shallow의 모든 요소를 출력
        System.out.println("1. 얕은 복사");
        for (int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);

        }
        // shallow[0] 값을 수정
        shallow[0] = 99;
        original[0] = 88;

        //original, shallow의 모든 요소를 출력
        for (int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);
        }

        // 2. 깊은 복사 - 수동 복사 (for문 사용)
        System.out.println("2. 깊은 복사");
        // {10, 20, 30} 형태의 초기화 작업은 배열 선언과 함게 해야함
        // 이미 선언된 변수에 새로운 배열을 할당 하려면 new int[][10, 20, 30} 형태로 작성해야함
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        shallow[0] = original[0]; // 10
        shallow[1] = original[1]; // 20
        shallow[2] = original[2]; // 30
        shallow[3] = original[3]; // 40
        shallow[4] = original[4]; // 50

        // shallow[0] 값을 수정
        shallow[0] = 99;
        original[0] = 88;

        //original, shallow의 모든 요소를 출력
        for (int i=0; i<original.length; i++){
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);
        }

        // 3. 깊은 복사 (System.arraycopy()이용)
        System.out.println("3. 깊은 복사 (System.arraycopy()이용) ");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        // original 배열의 index 0부터 끝까지 shallow에 복사
        System.arraycopy(original, 0, shallow, 0, original.length);

        // original, shallow의 모든 요소를 출력
        for (int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);

        }
        shallow[0] = 99;
        original[0] = 88;

        for (int i=0; i< original.length; i++) {
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);
        }
        // 4. 깊은복사 (Arrays.copyOF()이용)
        System.out.println("4. 깊은 복사 (Arrays.copyOF()이용) ");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(original, original.length);

        shallow[0] = 99;
        original[0] = 88;

        // original, shallow의 모든 요소를 출력
        for (int i=0; i< original.length; i++) {
            System.out.println("original: " + original[i] + ",shallow: " + shallow[i]);
        }

        }
}
