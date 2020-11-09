package Inheritance.Model.Species;
import Inheritance.Model.animals;

public class cat extends animals {
    public boolean eatFish;

    public cat(){
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
