package MySelfStudying.concepts_OOP.Inheritance.practice.task2;

public class Test {
    public static void main(String[] args) {

        Square sqr1 = new Square(2, "green", true);

        System.out.println("sqr1.getSide() = " + sqr1.getSide());
        sqr1.setSide(3.3);
        System.out.println("sqr1.getSide() = " + sqr1.getSide());
        System.out.println();

        sqr1.setWidth(2.3);
        sqr1.setLength(5.2);
    }
}
