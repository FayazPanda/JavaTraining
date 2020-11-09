package Inheritance.Model.Species;
import Inheritance.Model.animals;

public class cow extends animals {
    public boolean moo;

    public cow(){
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
