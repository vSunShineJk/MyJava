package MySelfStudying.concepts_OOP.Inheritance;

public class Student extends Person{
    double scholarship;
    int[] marks;

    public Student(String name, int age, double scholarship, int[] marks) {
        this.name = name;
        this.age = age;
        this.scholarship = scholarship;
        this.marks = marks;
    }
}
