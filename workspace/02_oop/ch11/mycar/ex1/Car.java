package ch11.mycar.ex1;

public class Car {
    // 필드
    String model;
    int speed; // 필드를 초기화 하지 않으면 기본값으로 초기화가 됨
    int gear; //

    // 10km/h 가속한다.
    void speedUp(){
        speed += 10; // 기존 스피드에 10을 증가 시켜라
        System.out.println("가속합니다. 현재 속도는 " + speed + "km/h입니다.");
    }

    // 10km/h 감속한다.
    void speedDown(){
        speed -= 10; // 기존 스피드에 10을 감속 시켜라
        System.out.println("감속합니다. 현재 속도는 " + speed + "km/h입니다.");

    }

    // 기어를 1단 올린다.
    void gearUp(){
        gear++;
        System.out.println("기어를 1단 올려서 " + gear + "단이 되었습니다");
    }

    // 기어를 1단 내린다.
    void gearDown(){
        gear--;
        System.out.println("기어를 1단 내려서 " + gear + "단이 되었습니다");
    }

    // 출발한다.
    void start(){
        System.out.println("출발합니다.");
        gearUp();
        speedUp();
    }

    // 멈춘다.
    void stop(){
        System.out.println("정지합니다.");
        gear = 0;
        while(speed > 0) {
            speedDown();
        }
    }

    }


