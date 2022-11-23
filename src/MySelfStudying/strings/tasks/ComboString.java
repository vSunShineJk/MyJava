package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class ComboString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // print true if str ends with ly

        // str == oddly
        // true
        // str == odd
        // false

        // str == y
        // false

        System.out.println(str.endsWith("ly"));


    }
}
