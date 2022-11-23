package MySelfStudying.concepts_OOP.Inheritance.practice.task1;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(double radius, String color, int height){
        super(radius,color);
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public double getVolume(){
        return Math.PI * radius * radius * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}
