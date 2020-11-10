package GarageEx.Garage;

import GarageEx.Garage.Model.Types.Brand.Honda;
import GarageEx.Garage.Model.Types.Brand.Yamaha;
import GarageEx.Garage.Model.Types.Brand.Suzuki;
import GarageEx.Garage.Model.Types.Brand.Toyota;
import GarageEx.Garage.Model.Vehicles;

import java.util.Random;
import java.util.ArrayList;


public class Garage {

    private ArrayList<Vehicles> vToFix = new ArrayList<>();
    Random r = new Random();

    public void popArray(){
        vToFix.add(new Honda());
        vToFix.add(new Yamaha());
        vToFix.add(new Suzuki());
        vToFix.add(new Toyota());
    }

    public void addVehicle(Vehicles v){
        vToFix.add(v);
    }

    public void listVehicles(){
        for(Vehicles v : this.vToFix){
            System.out.println(v.toString());
        }
    }

    public void vCost(){
        for(Vehicles v : this.vToFix){
            System.out.println("This car will cost: " + v.getBrandFee());
        }
    }

    public void emptyArray(){
        vToFix.clear();
    }

    public static void start(){
    }


}
