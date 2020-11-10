package Inheritance.Model.Species;
import Inheritance.Model.Animals;

public class Dog extends Animals {
    public boolean bark;

    public Dog(){
        super();
        this.bark = true;
    }

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }
}
