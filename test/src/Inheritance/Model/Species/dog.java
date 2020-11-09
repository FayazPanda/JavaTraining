package Inheritance.Model.Species;
import Inheritance.Model.animals;

public class dog extends animals {
    public boolean bark;

    public dog(){
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
