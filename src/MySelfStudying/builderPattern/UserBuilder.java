package MySelfStudying.builderPattern;

public class UserBuilder {
    public final String name;
    public final int age;

    public String address;
    public String gender;

    public UserBuilder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
