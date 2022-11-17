package CodingBat.warmup_2;

public class StringMatch {
    public static void main(String[] args) {
        String a = "aaxxaaxx";
        String b = "iaxxai";

        int len = 0;
        if (a.length() > b.length()) len = b.length();
        else len = a.length();

        int count = 0;
        for (int i = 0; i <= len-2; i++) if (a.substring(i,i+2).equals(b.substring(i,i+2))) count++;


        System.out.println(count);
    }
}
