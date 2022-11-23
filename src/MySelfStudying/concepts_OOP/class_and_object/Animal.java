package MySelfStudying.concepts_OOP.class_and_object;

public class Animal {

    // fields -- variables
    String name;
    int numberOfLegs;
    String animalKind;


    public void jump() {
        System.out.println(name + " is jumping!");
    }

    public String perOrWild() {
        if (animalKind.equals("dog") || animalKind.equals("cat")) {
            return "pet";
        } else if (animalKind.equals("livestock")) {
            return "housewifely";
        } else {
            return "wild";
        }
    }
}

/*

    What is a class?

        class is a blueprint/template of the object

    What is an object ?
        object is a real entity/instance which is created from a class.

        objects cannot exist without a class


    All objects have two properties:
        1) State (data members/fields/variables)
        2) Behaviour (methods)


    Structure of the class:
        1) data members/fields/variables
        2) methods

    all data members and methods together we call instance members

    what does instance mean?
    instance == object
    soo ---> instance members == everything related to object
    instance are just members of the object --> fields, methods


    class can include itself instance members and ALSO static members

    Q: how to create an instance member?
        just don't use static keyword

    Q: how to create static member?
        Use static keyword
 */
