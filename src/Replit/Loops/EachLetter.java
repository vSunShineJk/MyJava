package Replit.Loops;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
