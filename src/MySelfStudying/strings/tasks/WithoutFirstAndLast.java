package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class WithoutFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // word == coding
        // odin

        // word == java
        // av

        // word == Hello
        // ell
        System.out.print(word.substring(1, word.length()-1));
    }
}
