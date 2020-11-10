package Polymorphism.Model.Types;
import Polymorphism.Model.Vehicles;

public abstract class Car extends Vehicles {
    public int seats;

    public Car(){
        super();
        seats = 5;
    }

    public Car(int wheels, String engine, int cYear, String plate, int seats) {
        super(wheels, engine, cYear, plate);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
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
