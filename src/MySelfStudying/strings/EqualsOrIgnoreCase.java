package MySelfStudying.strings;

public class EqualsOrIgnoreCase {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println(word.equals("hello"));

        System.out.println(word.equals("HEllo"));

        System.out.println(word.equalsIgnoreCase("HELLO"));
    }
}
