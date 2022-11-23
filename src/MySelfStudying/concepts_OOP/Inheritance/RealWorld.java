package MySelfStudying.concepts_OOP.Inheritance;

public class RealWorld {
    public static void main(String[] args) {
        Employee saim = new Employee("Saim", 40, "Java mentor", 10_000);
        saim.jump();

        int[] marks = {5,6,5,5,5,5,5,4,5,5,6,5,5,6};
        Student student = new Student("Umid", 17, 100, new int[] {5,6,5,5,5,5,5,4,5,5,6,5,5,6});
        student.jump();
    }
}
