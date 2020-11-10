package GarageEx.Garage.Model.Types.Brand;
import GarageEx.Garage.Model.Types.Motorbike;

public class Suzuki extends Motorbike {
    private int brandFee;

    public Suzuki(){
        super();
        brandFee = 3000;
    }

    public Suzuki(int wheels, String engine, int cYear, String plate, String cooling, int brandFee) {
        super(wheels, engine, cYear, plate, cooling);
        this.brandFee = brandFee;
    }

    public int getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(int brandFee) {
        this.brandFee = brandFee;
    }
}
