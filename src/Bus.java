package modeling;

public class Bus extends Car {
    private int passenger;
    private int fee;

    public Bus(String carName,int velocity,int carSize,int fuel_volume,int passenger,int fee){
        System.out.println();
        super.carName=carName;
        super.velocity=velocity;
        super.carSize=carSize;
        super.fuel_volume=fuel_volume;
        this.passenger=passenger;
        this.fee=passenger*fee;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger=passenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee=fee;
    }

    //승객 탑승
    public void ridePassenger() {
        if(passenger > 0) {
            passenger++;
            fee += 1000;
        }
    }
    public void ridepassenger(int pass) {
        passenger+=pass;
        fee+=pass*1000;
    }
}
