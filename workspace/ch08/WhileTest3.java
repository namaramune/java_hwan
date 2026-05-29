package ch08;

// 6이 나올때 까지 주사위를 던져보자!!!
// 무작위 숫자 만드는 공식 num = (int)(Math.random()*6) + 1
public class WhileTest3 {
    public static void main(String[] args) {
        int testCount = 0;//실행 된 횟수
        while (testCount < 10) {//실행 할 목표 횟수
            int num = 0; // 초기 기본값
            int count = 0;// 한판에 주사위를 몇번 던졌는지
            while (num != 6) {
//             num이 6이 아니면 주사위 다시 던지기
                num = (int)(Math.random() * 6) + 1; // 0이상 5.9999999999999999...미만의 수
                //6이 나올때 까지 계속 던지면서 나온수를 전부 보여줌
                System.out.println(num);
                count++;
            } // 6이 나오면 한판 종료

            System.out.println("반복 횟수:" + count);
            testCount++;

        }
    }
}