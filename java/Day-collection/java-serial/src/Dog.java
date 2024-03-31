import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private String breed;

    //all the transient fields will not get serializes
    transient int legs;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        //this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
