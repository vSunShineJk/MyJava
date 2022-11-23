package MySelfStudying.concepts_OOP.encapsulation.example1;

public class User {
    // fields
    private String name;
    private String address;
    private int age;
    private String gender;

    private int password = 144;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(int password, String inputName) {
        if (password == this.password) {
            name = inputName;
        } else {
            System.out.println("NOT ABLE TO CHANGE THE NAME SINCE WRONG PASSWORD");
        }
    }

}
