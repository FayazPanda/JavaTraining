package Polymorphism.Model.Types.Brand;
import Polymorphism.Model.Types.car;

public class toyota extends car {
    public int brandFee;

    public toyota(){
        super();
        brandFee = 2000;
    }

    public toyota(int wheels, String engine, int cYear,int seats,int brandFee){
        super(wheels,engine,cYear,seats);
        this.brandFee = brandFee;
    }

    public int getBrandFee() {
        return brandFee;
    }

    public void setBrandFee(int brandFee) {
        this.brandFee = brandFee;
    }
}
