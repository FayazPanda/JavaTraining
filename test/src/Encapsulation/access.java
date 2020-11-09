package Encapsulation;
import Encapsulation.Model.person;

public class access {

    public static void main(String[] args) {

        person p = new person();
        p.setName("Daniel");
        p.setAge(45);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
