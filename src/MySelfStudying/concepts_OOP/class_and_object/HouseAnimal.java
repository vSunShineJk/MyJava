package MySelfStudying.concepts_OOP.class_and_object;


import java.util.ArrayList;

public class HouseAnimal {
    double weight;
    Animal pet;
    ArrayList<Animal> animals = new ArrayList<>();

    public void isPet() {
        if (!pet.perOrWild().equals("pet")) {
            System.out.println("Sorry you cannot hold this animal in your house");
        } else {
            System.out.println("This is pet");
        }
    }
}
