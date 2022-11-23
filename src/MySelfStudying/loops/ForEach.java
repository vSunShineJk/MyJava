package MySelfStudying.loops;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // for-each works only with arrays!

        int[] a = {1,2,3,4,5,6,7,8,9};
        for (int eachNumber : a) {
            System.out.println(eachNumber);
        }

        String[] words = {"Day", "Morning", "weather", "rain"};

        for (String each : words) {
            System.out.println(each);
            System.out.println(each.substring(0,2));
        }

        ArrayList<Character> chars = new ArrayList<>(List.of('A', 'b', 'u', 'b','a','k','r'));

        for (char each : chars) {
            System.out.print(each);
        }
    }
}
