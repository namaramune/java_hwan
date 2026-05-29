package ch08;

public class ForTest5 {
    public static void main(String[] args) {
        star1(); // 이게무슨 뜻인지 모르겠어
//        star2(); // 이게무슨 뜻인지 모르겠어
//        star3(); // 이게무슨 뜻인지 모르겠어
//        star4(); // 이게무슨 뜻인지 모르겠어
    }

    // *
    // **
    // ***
    // ****
    // *****
    static void star1(){ // 이게무슨 뜻인지 모르겠어
        for (int i=0; i<1; i++){ // 변수 i는 0에서 시작; i는 1보다 작다; i에 1을 더해줘
            System.out.print("*"); // *을 출력해줘
        }
        System.out.println(); // 이게무슨 뜻인지 모르겠어

        for (int i=0; i<2; i++) { // 변수 i는 0에서 시작; i는 2보다 작다; i에 1을 더해줘
            System.out.print("*");// *을 출력해줘
        }
        System.out.println(); // 이게무슨 뜻인지 모르겠어

        for (int i=0; i<3; i++) { //변수 i는 0에서 시작; i는 3보다 작다; i에 1을 더해줘
            System.out.print("*");// *을 출력해줘
        }
        System.out.println(); // 이게무슨 뜻인지 모르겠어

        for (int i=0; i<4; i++) { //변수 i는 0에서 시작; i는 4보다 작다; i에 1을 더해줘
            System.out.print("*");// *을 출력해줘
        }

    }

    static void star2() {
        // 중첩 for문
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*****
    //****
    //***
    //**
    //*
        static void star3 () {
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < 5-i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    //    *
    //   **
    //  ***
    // ****
    //*****
        static void star4 () {
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < (5-1-i); k++) {
                    System.out.printf(" ");
                }
                for (int k = 0; k < i+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

