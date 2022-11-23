package MySelfStudying;

public class DatatypeTranslating {
    public static void main(String[] args) {
        String s = "123";

        int num = Integer.parseInt(s);
        System.out.println(num);

        int a = 1024;
        String aStr = String.valueOf(a);
        System.out.println(aStr);

        // second way
        String aStr2 = "" + a;
        System.out.println(aStr2);

        String word = "Year 2022";
//      int year = Integer.parseInt(word); this throws an exception  because there are not-digit symbols in the String word
//      System.out.println(year);

        char letter = Character.valueOf(word.charAt(0));
        System.out.println(letter);
        letter = word.charAt(2);
        System.out.println(letter);
    }
}
