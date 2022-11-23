package MySelfStudying.strings;

public class Length {



    public static void main(String[] args) {
        // non-primitive --- String

        String s = "Waterfall";
        //          123456789
        // String is uni-mutable (не изменяемый)
        System.out.println(s.length());

        int num = s.length(); // int num = 9
        System.out.println(num);

        String str = "Hello, how are you?";

        int len = str.length();
        System.out.println(len);
    }
}
