package MySelfStudying;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Abu", "Umid", "James", "Sophie", "Poul", "Anna", "Harry"));

        System.out.println(names);

        names.removeIf(e -> e.length() < 5);

        System.out.println(names);
    }
}
