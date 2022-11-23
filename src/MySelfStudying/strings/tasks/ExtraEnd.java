package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class ExtraEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // Hello
        // --> lololo
        // word = hi
        // --> hihihi
        // word = apple
        // lelele

        // note: word.length will never be less than 2
        char ch = word.charAt(word.length() - 2);
        char ch2 = word.charAt(word.length() - 1);
        String word1 = "" + ch + ch2; // string concatenation
        System.out.println(word1 + word1 + word1);


        System.out.println("I have " + 10 + " candies");
        System.out.println("Now i have: " + 12+6);
        System.out.println("Now i have: " + (12+6));
    }
}
