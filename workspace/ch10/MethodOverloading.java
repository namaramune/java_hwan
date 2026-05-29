package ch10;

public class MethodOverloading {
    void main() {
//        int[] scores = {89, 78, 79};
//        System.out.println(toStringforint(scores));

        double[] scores2 = {12.0, 45.6};
        System.out.println(toStringfordouble(scores2));
    }


    // 배열 내부의 모든 요소 값들을 무자열로 변환한다.
    // [34, 3, 45, 4, 5]

        // double 배열 내부의 모든 요속 값들을 문자열로 반환한다.
    String toStringfordouble(double[] arr){
        String result = "[";
        for (int i=0; i<arr.length; i++){
            result += arr[i];
            if(i != arr.length-1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
