package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class MakeTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.next(); // i
        String word = sc.next(); // Rain

        // -->   <p>Hello</p>
        // -->   <i>Rain</i>

        System.out.println("<" + tag + ">" + word + "</" + tag + ">");
    }
}
