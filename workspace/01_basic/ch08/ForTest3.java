package ch08;

public class ForTest3 {
    public static void main(String[] args) {
        // 10부터 1까지 카운트 다운
        // int=10, 10이 1보다 낮아지면 멈춤, 10을 1식빼기
        for (int i = 10; i >= 1; i--) { // i: 10, 9, 8, 7.....
            System.out.println("카운트 다운 " + i);
        }
        System.out.println("발사!!");
    }
}
