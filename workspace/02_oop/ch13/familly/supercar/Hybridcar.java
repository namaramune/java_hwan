package ch13.familly.supercar;

public class Hybridcar extends SuperCar {
//    Hybridcar() {super();}

    Hybridcar(int zero100) {
        super(zero100);
    }

    @Override
    void move() {
        super.move();
            System.out.println("하이브리드 차 운행합니다.");

    }
}
