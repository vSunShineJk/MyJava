package MySelfStudying.concepts_OOP.encapsulation.example2;

public class Management2 {
    public static void main(String[] args) {
        User2 obj = new User2("Umid", 17, "England, London B. ");

        System.out.println(obj.getAddress());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
