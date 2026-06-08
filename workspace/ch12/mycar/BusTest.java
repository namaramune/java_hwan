package ch12.mycar;

public class BusTest {
    void main(){
        Bus mycar = new Bus("우정버스", "10-2", "마을 버스"
                , new String[]{"우리집", "김포고등학교", "김포 시청"}
                , 1300, 15);
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();

        mycar.ride(3,1);
        mycar.ride(2,1);
        mycar.ride(1,2);
        mycar.ride(4,3);

        mycar.start();
        mycar.speedUp();
        mycar.stop();
        mycar.ride(3,1);
        mycar.ride(3,3);
        mycar.leave();
        mycar.ride(3,2);

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedDown();
        mycar.stop();
        mycar.leave();
        mycar.leave();

        System.out.println(mycar.getBusInfo());
    }
}