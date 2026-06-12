package ch12.animal;

public class Test {
    public static void main(String[] args){
        Dog haru = new Dog();
//        Animal haru = new Dog(); // 자식 인스턴스를 부모 타입으로 선언 가능
        haru.eat(); // 부모에게 물려받은 매서드
        haru.bark(); // 추가한 매서드

        animalCare(haru);

//        Notebook book = new Notebook();
//        animalCare(book);
    }
    // 동물 관리 서비스
    static void animalCare(Animal a){
        a.eat();
        a.sleep();
        a.move();
//        a.bark();
//        a.liquefy();
    }


    // 강아지 관리 서비스
    static void animalCare(Dog a) {
        a.eat();
        a.sleep();
        a.move();
        a.bark();
    }
//        a.bark(); // Animal에는 정의 되어 있지 않음
        // 고양이 관리 서비스
    static void animalCare(Cat a){
        a.eat();
        a.sleep();
        a.move();
        a.liquefy();
    }
}
