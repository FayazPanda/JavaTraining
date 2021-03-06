package Inheritance.Model;

public class Animals {

    private String name;
    private String species;
    private int age;

    public Animals(){
        name = "Dave";
        species = "hamster";
        age = 12;
    }

    public Animals(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
