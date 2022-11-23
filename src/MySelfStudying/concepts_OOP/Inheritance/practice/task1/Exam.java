package MySelfStudying.concepts_OOP.Inheritance.practice.task1;

public class Exam {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.1,"red");

        System.out.println("Area: "+c1.getArea());
        System.out.println("Color: "+c1.getColor());
        System.out.println("Radius: "+c1.getRadius());

        System.out.println("-------------------------------");

        Cylinder cy1 = new Cylinder(2,"blue",4);
        System.out.println("Area: "+cy1.getArea());
        System.out.println("Height: "+cy1.getHeight());
        System.out.println("Volume: "+cy1.getVolume());
    }
}
