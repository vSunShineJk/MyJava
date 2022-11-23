package MySelfStudying.class_object;

public class Nature {
    public static void main(String[] args) {

        Animal obj = new Animal();

        obj.name = "fox";
        obj.numberOfLegs = 4;

        obj.run();

        // object is the real entity or object is an copy of the class

        // we create the object to use this class

        Animal obj2 = new Animal();
        obj2.name = "spider";
        obj2.numberOfLegs = 8;

        System.out.println(obj2.name);
        obj2.run();

        // object cannot exist without a class

        // class can exist without an object
    }
}
