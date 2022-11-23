package MySelfStudying.concepts_OOP.encapsulation;

public class WildLife {
    public static void main(String[] args) {
        Swan swan = new Swan();

//        swan.numberOfEggs = -3;

        swan.setNumberOfEggs(-3);
        System.out.println(swan.getNumberOfEggs());

        swan.setNumberOfEggs(5);
        System.out.println(swan.getNumberOfEggs());
    }
}
