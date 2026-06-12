package ch13.familly.supercar;

public class GasolineCar extends SuperCar {
//    GasolineCar() {super();}
    // 컴파일러에 의해서 기본 생성자 만들어짐

    GasolineCar(int zero100){
        super(zero100);
    }

    @Override
    void move(){
        // 3번
        super.move();
        // 5번
        System.out.println("기름을 사용합니다.");
    }
}
