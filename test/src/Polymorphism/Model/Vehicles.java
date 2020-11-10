package Polymorphism.Model;

public abstract class Vehicles {
    private int wheels;
    private String engine;
    private int cYear;
    private String plate;
    private int brandFee;

    public Vehicles(){
        super();
        wheels = 4;
        engine = "diesel";
        cYear = 2004;
        plate = "LS55 FCN";
        brandFee = 0;
    }

    public Vehicles(int wheels, String engine, int cYear, String plate) {
        super();
        this.wheels = wheels;
        this.engine = engine;
        this.cYear = cYear;
        this.plate = plate;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getcYear() {
        return cYear;
    }

    public void setcYear(int cYear) {
        this.cYear = cYear;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(int brandFee) {
        this.brandFee = brandFee;
    }
}
