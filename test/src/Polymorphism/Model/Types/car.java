package Polymorphism.Model.Types;
import Polymorphism.Model.vehicles;

public class car extends vehicles {
    public int seats;

    public car(){
        super();
        seats = 5;
    }

    public car(int wheels, String engine, int cYear,int seats) {
        super(wheels, engine, cYear);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
