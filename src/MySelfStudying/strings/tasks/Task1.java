package MySelfStudying.strings.tasks;

public class Task1 {
    public static String printChars(String str) {
        return "" + str.charAt(0) + str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(printChars("Lemon"));

    }
}
