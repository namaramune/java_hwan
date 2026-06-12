package ch13.familly.supercar;

public class DriverTest {
    public static void main(String[] args){
        GasolineCar gcar = new GasolineCar(8);
        Hybridcar hcar = new Hybridcar(7);
        ElectricCar ecar = new ElectricCar(4);
        PlugInHybriCar pcar = new PlugInHybriCar(5);


        Driver driver = new Driver();
        // 1번
        driver.drive(gcar);
        driver.drive(hcar);
        driver.drive(ecar);
        driver.drive(pcar);
        // 6번
        System.out.println("프로그렘을 종료합니다.");
    }
}
