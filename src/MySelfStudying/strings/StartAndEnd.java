package MySelfStudying.strings;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Hello my friend";
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Friend"));

        boolean b = str.startsWith("Hello my");
        System.out.println(b);

        String name = "AbuAbu";
        //             0123

        System.out.println(name.startsWith("Ab", 3));
        System.out.println(name.startsWith("Ab", 2));
        System.out.println(name.endsWith("bu"));
    }
}
