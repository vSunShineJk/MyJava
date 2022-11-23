package MySelfStudying.Scanner;

import java.util.Scanner;

public class NextOrNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        System.out.println(word);

        System.out.println("Enter the sentence");
        sc.nextLine(); // to catch the enter
        String sentence = sc.nextLine();
        System.out.println(sentence);
    }
}
