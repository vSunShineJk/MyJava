package MySelfStudying.concepts_OOP.polymorphism.geometry;

public class Rectangle implements Shape{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double findArea() {
        return width*length;
    }
}
