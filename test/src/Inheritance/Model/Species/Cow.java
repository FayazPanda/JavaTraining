package Inheritance.Model.Species;
import Inheritance.Model.Animals;

public class Cow extends Animals {
    public boolean moo;

    public Cow(){
        super();
        this.moo = true;
    }

    public boolean canMoo() {
        return moo;
    }

    public void setMoo(boolean moo) {
        this.moo = moo;
    }
}
