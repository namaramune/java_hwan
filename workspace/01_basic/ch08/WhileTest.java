package ch08;

//1부터 지정한 수 까지의 합계를 구하시오.
public class WhileTest {
    public static void main(String[] args){
        // 명령형 매개변수
        // java ch08.WhileTest 10 20
        // args[0] -> 10
        // args[1] => 20
//        int num = Integer.parseInt (args [0]); // 여기까지 진행해라
        int num = 10;
        int i= 1; // 1,2,3,4,.....
        int sum = 0; // 0,1,3,6,10,15,21,28,36,45,55

        // 반복문 없이 구현
//        sum = sum + i // 0 + 1
//        System.out.println("i" + i + ", sum: " + sum );// i: 1,sum:1 1++; //2

        while (i <= num){//이 조건이 만족하는 동안에만 반복적으로 실행해라
            sum += i;
            System.out.println("i" + i + ",sum;" + sum);
            i++;
        }

        System.out.println("1부터" + num + "까지의 합계: " + sum);
    }
}
