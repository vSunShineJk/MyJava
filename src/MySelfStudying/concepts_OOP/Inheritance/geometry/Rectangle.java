package MySelfStudying.concepts_OOP.Inheritance.geometry;

public class Rectangle extends Square{
    int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }

    @Override
    public int findPerimeter() {
        return (width+length)*2;
    }

    @Override
    public int findArea() {
        return width*length;
    }
}
