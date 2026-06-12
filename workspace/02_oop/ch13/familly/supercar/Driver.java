package ch13.familly.supercar;

public class Driver {
    // 기본 생성자

    void drive(SuperCar car) {
        // 2번
        car.move();

        if (car instanceof Chargeable) {
            ((Chargeable) car).charge();
        }
    }
}

