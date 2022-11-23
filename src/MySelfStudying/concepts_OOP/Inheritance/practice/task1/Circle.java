package MySelfStudying.concepts_OOP.Inheritance.practice.task1;

import java.lang.reflect.Member;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
