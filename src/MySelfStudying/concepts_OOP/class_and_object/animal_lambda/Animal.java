package MySelfStudying.concepts_OOP.class_and_object.animal_lambda;

public class Animal {
    String name;

    boolean canSwim;
    boolean canJump;

    public Animal(String name, boolean canSwim, boolean canJump) {
        this.name = name;
        this.canSwim = canSwim;
        this.canJump = canJump;
    }

    @Override
    public String toString() {
        return name;
    }
}
