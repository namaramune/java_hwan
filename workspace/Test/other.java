package Test;

import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        // [수정] 배열 선언할 때 이름(numbers)이 빠져서 채워 넣었습니다!
        int[] numbers = {0, 13, 5, 7, 9};

        // 1. 임시 챔피언 정하기 (0번 방에 있는 '0'을 최고존엄 max에 저장)
        int max = numbers[0];

        // 2. 1번 방부터 끝방까지 돌면서 순서대로 대결하기
        for (int i = 1; i < numbers.length; i++) {

            // 3. 만약 지금 나타난 도전자(numbers[i])가 현재 챔피언(max)보다 크다면?
            if (numbers[i] > max) {
                max = numbers[i]; // 챔피언 왕좌를 새로운 숫자로 교체한다!
            }
        }

        // 4. 최종 살아남은 챔피언 출력
        System.out.println("배열에서 가장 큰 숫자는: " + max);
    }

}
