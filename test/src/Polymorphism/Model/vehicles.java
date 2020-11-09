package Polymorphism.Model;

public class vehicles {
    private int wheels;
    private String engine;
    private int cYear;

    public vehicles(){
        super();
        wheels = 4;
        engine = "diesel";
        cYear = 2004;
    }

    public vehicles(int wheels, String engine, int cYear) {
        super();
        this.wheels = wheels;
        this.engine = engine;
        this.cYear = cYear;
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
}
