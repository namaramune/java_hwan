package ch09;

public class EnhancedFor {
    public static void main(String[] args){
        // int[] scores = {90, 80, 75}; // 3과목
        int[] scores = {100, 80, 70, 88}; // 4과목

        int sum = 0; // 총점
        double avg = 0; // 평균

        // 일반 for 구문 (주석 내 오타 수정)
        // for (int i=0; i<scores.length; i++){
        //     sum += scores[i];
        //     // sum += score; -> 이 부분은 일반 for문 안에 있으면 에러가 납니다.
        // }

        // Enhanced for loop(강화된 for 구문)
        for(int score: scores) {
            sum += score;
        }
        avg = (double)sum / scores.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    } // main 메서드 끝
} // class 끝 (이 부분 중괄호가 누락되어 있었습니다)