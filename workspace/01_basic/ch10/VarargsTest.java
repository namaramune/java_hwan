//package ch10;
//
//public class VarargsTest {
//
////    // int 2개의 합계를 출력하는 매서드
////    void sum(int n1, int n2){
////        System.out.println("2. sum2 매서드 시작");
////        int result = n1 + n2;
////        System.out.println("3. " + n1 + " + " + n2 + " = " + result);
////        System.out.println("sum2 매서드 시작");
////    }
////    // int 3개의 합계를 출력하는 매서드
////    void sum(int n1, int n2, int n3){
////        System.out.println("sum3 매서드 시작");
////        int result = n1 + n2 + n3;
////        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + result);
////        System.out.println("sum3 매서드 시작");
////    }
////
////    // int 4개의 합계를 출력하는 매서드
////    void sum(int n1, int n2, int n3, int n4){
////        System.out.println("sum4 매서드 시작");
////        int result = n1 + n2 + n3 + n4;
////        System.out.println(n1 + " + " + n2 + " + " + n3 + " + " + n4 +" = " + result);
////        System.out.println("sum4 매서드 시작");
//    }
//    // int n개Sum의 합계를 출력하는 매서드
//    void printSum(int... nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//            System.out.println(sum);
//        }
//
////    void main(String[] args){
////        System.out.println("1. main 매서드 시작");
//////        sum(10, 20);
//////        sum(10, 20, 30);
//////        sum(10, 20, 30, 40);
////        sum(12,34,3,546,666,13,2,76,8,777,199);
////        System.out.println("main 매서드 종료");
//
//    }
//
//
//
//
