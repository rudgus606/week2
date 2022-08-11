package modeling;

public class CarTest {
    public static void main(String[] args) {
        //변수 선언
        Bus bus;
        Taxi taxi;

        //인스턴스
        bus = new Bus("100",60,2000,100,20,1000);
        taxi = new Taxi("taxi",80,1500,100,2,3000);

        System.out.println(bus.getCarInfo()+" passenger :"+bus.getPassenger()+" Fee : "+bus.getFee()+"Won");
        System.out.println(taxi.getCarInfo()+" passenger :"+taxi.getPassenger()+" Fee : "+taxi.getFee()+"Won");


    }
}
