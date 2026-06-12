package ch09;

public class ArrayBassic {
    public static void main(String[] args){
        // socores int 배열을 선언하고 생성하세요.(크기는 3)
        int [] socores = new int[3];
        // names String 배열을 선언하고 생성하세요.(크기는 3)
//        String [] names = new String[3];
        String [] names = new String[5];
        // scores 배열의 각 요소에 값을 할당
        socores[0] = 90;
        socores[1] = 80;
        socores[2] = 75;

        // names 배열의 각 요소에 값을 할당
        names [0] = "나무";
        names [1] = "하루";
        names [2] = "자루";
//        names [3] = "조이";
//        names [4] = "귤이";

        // scores 배열의 두번째 요소값을 출력
        System.out.println(socores[1]);

        // names 배열의 모든 요소값을 출력
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
//        System.out.println(names[5]);

        for(int i=0; i< names.length; i++){
            System.out.println(names[i]); // i=0 names[0]=나무/ 1로 설정시 1식 늘어나는게 아닌 1로 다시 인식
        }
    }
}
