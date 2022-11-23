package MySelfStudying.concepts_OOP.Inheritance.practice.task2;

public class Square {
    double side;
    String color;
    boolean filled;
    double width;
    double length;

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double SetSide){
        side = SetSide;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
