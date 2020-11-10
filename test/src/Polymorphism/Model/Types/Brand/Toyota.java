package Polymorphism.Model.Types.Brand;
import Polymorphism.Model.Types.Car;

public class Toyota extends Car {
    private int brandFee;

    public Toyota(){
        super();
        brandFee = 2000;
    }

    public Toyota(int wheels, String engine, int cYear, String plate, int seats, int brandFee){
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
