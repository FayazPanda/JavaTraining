package Inheritance.Model.Species;
import Inheritance.Model.Animals;

public class Cat extends Animals {
    public boolean eatFish;

    public Cat(){
        super();
        this.eatFish = true;
    }

    public boolean canEatFish() {
        return eatFish;
    }

    public void setEatFish(boolean eatFish) {
        this.eatFish = eatFish;
    }
}
