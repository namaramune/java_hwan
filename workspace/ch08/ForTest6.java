package ch08;

//1~9 구구단
//2단 3단 4단 5단 6단 7단 8단 9단
//2*2 3*3 4*4 .....
//.....
public class ForTest6 {
    public static void main(String[] args){
        for(int i=1; i<=9; i++){ // 9행
            for(int k=2; k<9; k++){ // 8열
                System.out.print(k + "x" + i + "=" + (k*i) + "\t"); //k= 2, 3, 4
            }
            System.out.println();
        }
    }
}
