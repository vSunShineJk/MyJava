package MySelfStudying.concepts_OOP.Inheritance.geometry;

public class Square {
    int length;

    public Square(int length) {
        this.length = length;
    }

    public int findPerimeter() {
        return length*4;
    }

    public int findArea() {
        return length*length;
    }
}
