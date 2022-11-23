package MySelfStudying.strings;

import java.util.Scanner;

public class ToUpperAndLower {
    public static void main(String[] args) {
        String word1 = "WaterFall";
        String word2 = "waterfall";

        System.out.println(word1.equals(word2)); //  word1 == word2
        //    10 == 12
        //    word1.equals(word2)
        word1 = word1.toLowerCase();
        System.out.println(word1);
        System.out.println(word1.equals(word2));

        String str = "ghfAbFBhBAHSDasdk";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two words: ");
        String w1 = sc.next().toLowerCase();
        String w2 = sc.next().toLowerCase();
        System.out.println(w1.equals(w2));
    }
}
