public class ReverseTheString {
    public static void main(String[] args) {
        String word = "Hello world";

        String reversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }

        System.out.println(reversed);
    }
}
