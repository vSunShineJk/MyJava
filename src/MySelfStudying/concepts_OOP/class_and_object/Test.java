package MySelfStudying.concepts_OOP.class_and_object;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // how to create an object:
//      data type --> reference --> new keyword --> constructor
        Animal cow = new Animal();
        System.out.println("fields before assigning: ");
        System.out.println(cow.name);
        System.out.println(cow.numberOfLegs);
        cow.name = "Cow";
        cow.numberOfLegs = 4;
        cow.animalKind = "livestock";
        System.out.println("after assigning: ");
        System.out.println(cow.name);
        System.out.println(cow.numberOfLegs);
        System.out.println(cow);

        System.out.println("-------------------------------");
        Animal dog = new Animal();
        dog.name = "chihuahua";
        dog.numberOfLegs = 4;
        dog.animalKind = "dog";
        System.out.println("name: " + dog.name);
        System.out.println("legs=" + dog.numberOfLegs);

        cow.jump();
        dog.jump();

        System.out.println(cow.perOrWild());
        System.out.println(dog.perOrWild());

        Animal tiger = new Animal();
        tiger.animalKind = "predator";
        tiger.name = "tiger";
        tiger.numberOfLegs = 4;
        System.out.println(tiger.perOrWild());

        Animal insect = new Animal();
        insect.numberOfLegs = 8;
        insect.name = "spider";
        insect.animalKind = "spider";
        System.out.println(insect.perOrWild());

        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(cow);
        allAnimals.add(dog);
        allAnimals.add(tiger);
        allAnimals.add(insect);
        allAnimals.add(new Animal());
        System.out.println(allAnimals);


        int a;
        a = 12;

        Animal object; // declaring
        object = new Animal(); // assigning


        HouseAnimal obj = new HouseAnimal();
        obj.pet = new Animal();
        obj.pet.name = "kitty";
        obj.pet.animalKind = "cat";
        obj.pet.numberOfLegs = 4;

        obj.weight = 2.7;

        obj.isPet();

        obj.animals.add(obj.pet);

//        String str = null;
//        System.out.println(str.length()); this will cause a NullPointerException


    }
}
