package ch12.mycar;

public class BusTest {
    void main(){
        Bus2 mycar = new Bus2("우정버스", "10-2", "마을 버스"
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
        mycar.leave(3);
        mycar.ride(3,1);
        mycar.ride(4,2);
        mycar.ride(3,2);

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedDown();
        mycar.stop();
        mycar.leave(2);

        System.out.println(mycar.getBusInfo());
    }
}