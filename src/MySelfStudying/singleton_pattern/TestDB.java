package MySelfStudying.singleton_pattern;

public class TestDB {
    public static void main(String[] args) {
        DataBase obj1 = DataBase.getInstance();
        obj1.names.add("Umid");

        DataBase obj2 = DataBase.getInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj2.names.get(0));
    }
}
