package MySelfStudying.wrapperClasses;

public class Examples {
    public static void main(String[] args) {
        int b = 4;

        Integer number = 4;

        int num = number;

        Integer obj = b; // autoboxing
        // Character

        String str = "34";

        int a = Integer.parseInt(str);
        Integer integer = Integer.valueOf(str);

        int g = Integer.valueOf(str);

        System.out.println(a);
        System.out.println(integer);

        String word = "weather";
        char c = word.charAt(4);
        Character ch = c;


        int i = 645;
        String s = String.valueOf(i);


        String w = "abc.]./345";
        System.out.println(Character.isDigit(w.charAt(w.length() - 1)));
    }
}
