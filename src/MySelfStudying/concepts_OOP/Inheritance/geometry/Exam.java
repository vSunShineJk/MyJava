package MySelfStudying.concepts_OOP.Inheritance.geometry;

public class Exam {
    public static void main(String[] args) {
        Square abcd = new Square(7);
        System.out.println(abcd.findPerimeter());
        System.out.println(abcd.findArea());

        Rectangle rec = new Rectangle(10, 6);
        System.out.println("rec S = " + rec.findArea());
        System.out.println("rec P = " + rec.findPerimeter());
    }
}
