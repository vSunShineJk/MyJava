package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class FirstTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "";

        // word == hello
        // he

        // word == sky
        // sk

        // word == play
        // pl

        // word == i
        // i

        // word = ""
        // ""
        if (word.length() < 2){
            System.out.println(word);
        } else {
            System.out.println(word.substring(0,2));
        }

    }
}
