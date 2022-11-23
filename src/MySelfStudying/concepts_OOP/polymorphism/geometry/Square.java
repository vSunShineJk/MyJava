package MySelfStudying.concepts_OOP.polymorphism.geometry;

public class Square implements Shape{
    int length;

    @Override
    public double findPerimeter() {
        return length*4;
    }

    @Override
    public double findArea() {
        return length*length;
    }
}
