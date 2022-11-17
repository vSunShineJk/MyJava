package CodingBat.string_2;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;

        System.out.println(str.substring(n));
        System.out.println(str.substring(0,n));
        System.out.println(str.substring(n).contains(str.substring(0,n)));
    }
}
