package ch08;

public class DoWhileTest {
    public static void main(String[] args) {
        int num;


        do {
            num = (int) (Math.random() * 6) + 1; //num은 이내용
            System.out.println("굴린 결과" + num);

        }while ((num != 6)) ;
        System.out.println("6이나와 종료합니다");
    }
}
