package MySelfStudying.concepts_OOP.polymorphism.geometry;

public class Test {
    public static void main(String[] args) {
        Square square = new Square();
        square.length = 5;
        System.out.println(square.findArea());

        Rectangle rectangle = new Rectangle(4, 10);
        System.out.println(rectangle.findPerimeter());

        Shape obj = new Rectangle(14, 7);
        System.out.println(obj.findPerimeter());
    }
}
