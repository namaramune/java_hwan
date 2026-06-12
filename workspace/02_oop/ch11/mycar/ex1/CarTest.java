package ch11.mycar.ex1;

public class CarTest {
    void main(){
        // Car 인스턴스를 생성한다.
        //인스턴스를 생성할 때 사용한 클래스가 생성한 인스턴스의 탑이이 된다.
        Car mycar = new Car();
        mycar.model = "부가티";

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();
    }
}
