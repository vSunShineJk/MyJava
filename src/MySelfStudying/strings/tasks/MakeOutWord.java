package MySelfStudying.strings.tasks;

import java.util.Scanner;

public class MakeOutWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.next(); // <<>>
        String word = sc.next(); // apple

        // -->   <<apple>>
        // tag = [[]]
        // apple
        // --> [[apple]]

        // note: the length of 'tag' always will be == 4

        System.out.println(tag.substring(0,2) + word + tag.substring(2));



    }
}
