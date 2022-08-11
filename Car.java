package modeling;

public class Car {
    String carName;
    int velocity;
    int carSize;
    int fuel_volume;
    public Car() {
        System.out.println();
    }

    //차의 공통 기능
    public void speedUp(int speed) {
        velocity += speed;
    }

    public  void speedDown(int speed) {
        velocity -= speed;
    }

    public void stop() {
        velocity = 0;
        fuel_volume = 0;
    }

    public String getCarInfo() {
        return "carname :" +carName+" oil "+fuel_volume+" speed :"+velocity;
    }

    public void increased_fuel(int oil) {
        fuel_volume += oil;
    }

    public void reduced_fuel(int oil) {
        fuel_volume -= oil;
    }
}
