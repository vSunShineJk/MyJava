package MySelfStudying.concepts_OOP.encapsulation.example1;

import MySelfStudying.concepts_OOP.class_and_object.Building;

public class Management {
    public static void main(String[] args) {

        User obj = new User();
        System.out.println(obj.getName());
        obj.setName(144, "Abu");
        System.out.println(obj.getName());

        Building building = new Building();

    }
}