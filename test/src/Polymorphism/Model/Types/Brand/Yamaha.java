package Polymorphism.Model.Types.Brand;
import Polymorphism.Model.Types.Motorbike;

public class Yamaha extends Motorbike {
    private int brandFee;

    public Yamaha(){
        super();
        brandFee = 500;
    }

    public Yamaha(int wheels, String engine, int cYear, String plate, String cooling, int brandFree) {
        super(wheels, engine, cYear, plate, cooling);
        this.brandFee = brandFree;
    }

    public int getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(int brandFee) {
        this.brandFee = brandFee;
    }
}
