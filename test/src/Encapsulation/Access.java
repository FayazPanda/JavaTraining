package Encapsulation;
import Encapsulation.Model.Person;

public class Access {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Daniel");
        p.setAge(45);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
