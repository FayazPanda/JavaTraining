package GarageEx.Garage.Model.Types;
import GarageEx.Garage.Model.Vehicles;

public abstract class Motorbike extends Vehicles {
    public String cooling;

    public Motorbike(){
        super(2,"petrol",2010,"UYJ5 CND");
        cooling = "liquid";
    }

    public Motorbike(int wheels, String engine, int cYear, String plate, String cooling) {
        super(wheels, engine, cYear, plate);
        this.cooling = cooling;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    @Override
    public int getBrandFee() {
        return super.getBrandFee();
    }

    @Override
    public void setBrandFee(int brandFee) {
        super.setBrandFee(brandFee);
    }
}
