package Test;

// 중요! 자바가 미리 만들어 둔 배열 관리 도구 상자(Arrays)를 꺼내 쓰겠다고 선언합니다.
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        // 테스트용 배열들을 생성합니다.
        int[] arr = {3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};

        System.out.println("1. arr의 모든 요소를 출력하세요.");
        // arr 배열의 처음(0번)부터 끝(arr.length-1번)까지 방을 돌며 숫자를 하나씩 출력합니다.
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("\n2. arr2와 arr3의 모든 요소가 같은 값을 가지고 있는지 출력하세요.(순서와 값이 모두 일치)");

        /* [잘못된 방식 예시]
           System.out.println(arr2 == arr3);
           배열 이름(arr2, arr3)은 메모리 주소값이라서 이렇게 == 로 비교하면 무조건 false가 납니다.
        */

        // 원래 원리: for문을 돌려 직접 일일이 비교하는 방식
        // boolean(참/거짓) 타입의 'isEqual(둘이 같니?)' 방을 만들고, 일단 true(같다)를 넣어둡니다.
        boolean isEqual = true;

        for(int i=0; i< arr2.length; i++){
            // arr2의 i번째 숫자와 arr3의 i번째 숫자가 '다르면(!=)' 실행합니다.
            if (arr2[i] != arr3[i]) {
                isEqual = false; // "어? 숫자가 다르네? 똑같다는 말 취소!" -> false로 변경
                break;           // 하나라도 다르면 더 볼 필요 없으니 반복문을 즉시 탈출(종료)합니다.
            }
        }
        // 삼항연산자(isEqual이 true면 "같음", false면 "다름")를 이용해 결과를 출력합니다.
        System.out.println("★직접 비교 결과 -> arr2, arr3는 서로 " + (isEqual ? "같음" : "다름"));

        // 편리한 방식: 도구 상자(Arrays)의 기능을 쓰면 위의 복잡한 for문이 한 줄로 끝납니다!
        System.out.println("★Arrays 도구 결과 -> arr2, arr3 같다? : " + Arrays.equals(arr2, arr3)); // false 출력
        System.out.println("★Arrays 도구 결과 -> arr2, arr4 같다? : " + Arrays.equals(arr2, arr4)); // true 출력


        System.out.println("\n3. arr 요소의 최소값과 최대값을 구하세요.");

        /* [원래 원리: for문으로 일일이 크기 비교하기]
           int min = arr[0]; // 일단 첫 번째 숫자를 가장 작은 수라고 가정
           int max = arr[0]; // 일단 첫 번째 숫자를 가장 큰 수라고 가정

           for(int i=1; i<arr.length; i++){
               if(arr[i] < min){ // 방을 돌다가 min보다 더 작은 숫자를 발견하면
                   min = arr[i]; // 그 숫자를 새로운 최소값으로 교체한다.
               }
               if (arr[i] > max){ // 방을 돌다가 max보다 더 큰 숫자를 발견하면
                   max = arr[i]; // 그 숫자를 새로운 최대값으로 교체한다.
               }
           }
           System.out.println("최소값: " + min);
           System.out.println("최대값: " + max);
        */

        // 똑똑한 꼼수: 배열을 정렬(sort)하면 맨 앞이 최소값, 맨 뒤가 최대값이 됩니다!
        Arrays.sort(arr); // arr 배열을 [2, 3, 3, 3, 5, 5, 6, 6, 7, 8, 8] 로 정렬함

        System.out.println("최소값(가장 첫 번째 칸): " + arr[0]);
        System.out.println("최대값(가장 마지막 칸): " + arr[arr.length-1]);


        System.out.println("\n4. arr의 요소를 오름차순으로 정렬 하세요.");

        /* [원래 원리: 이중 for문으로 데이터 자리바꿈(Swap)하기]
           for (int i=0; i<arr.length; i++){
               for (int k=i; k<arr.length-1; k++){
                   if(arr[i] > arr[k+1]){
                       // 앞의 숫자가 뒤의 숫자보다 크다면 두 숫자의 자리를 바꿉니다.
                       int temp = arr[i]; // 컵 하나가 비어있어야 바꿀 수 있으므로 임시 변수(temp)에 백업
                       arr[i] = arr[k+1];
                       arr[k+1] = temp;
                   }
               }
           }
        */

        // 정렬 전 상태 출력하기 위해 임의의 배열을 다시 선언 (현재 arr은 위에서 이미 정렬되었기 때문)
        int[] arrDemo = {3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 3};

        // Arrays.toString(배열명) : 배열 상자 안에 뭐가 들었는지 가로로 [1, 2, 3] 예쁘게 문자열로 보여주는 기능
        System.out.println("정렬 전 배열 상태: " + Arrays.toString(arrDemo));

        // Arrays.sort(배열명) : 도구 상자를 이용해 알아서 순서대로 칼정렬 시키는 기능
        Arrays.sort(arrDemo);

        System.out.println("정렬 후 배열 상태: " + Arrays.toString(arrDemo));
    }
}