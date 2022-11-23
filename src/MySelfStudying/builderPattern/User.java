package MySelfStudying.builderPattern;

public class User {
    private final String name;
    private final int age;

    private final String address;
    private final String gender;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
