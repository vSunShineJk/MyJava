package MySelfStudying.builderPattern;

public class UserTest {
    public static void main(String[] args) {
        User obj = new UserBuilder("Umid", 17).gender("male").build();

        System.out.println(obj);

        User obj2 = new UserBuilder("Abu", 17).build();
        System.out.println(obj2);
    }
}
