package Polymorphism.Model.Types.Brand;
import Polymorphism.Model.Types.Car;

public class Honda extends Car {
    private int brandFee;


    public Honda(){
        super();
        brandFee = 1500;
    }

    public Honda(int wheels, String engine, int cYear, String plate, int seats, int brandFee){
        super(wheels, engine, cYear, plate,seats);
        this.brandFee = brandFee;
    }

    public int getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(int brandFee) {
        this.brandFee = brandFee;
    }
}
