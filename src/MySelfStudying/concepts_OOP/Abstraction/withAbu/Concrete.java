package MySelfStudying.concepts_OOP.Abstraction.withAbu;


interface A {
    void run();
}

interface B {
    default void run() {
        System.out.println("something");
    }
}



public class Concrete implements A, B{
    @Override
    public void run() {
        System.out.println("implementation");

    }
}
