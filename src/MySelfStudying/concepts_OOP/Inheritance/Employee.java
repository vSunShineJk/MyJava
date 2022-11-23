package MySelfStudying.concepts_OOP.Inheritance;

public class Employee extends Person{
    String job;
    double salary;

    public Employee(String name, int age, String job, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }
}
