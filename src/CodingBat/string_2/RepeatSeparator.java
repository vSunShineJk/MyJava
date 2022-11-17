package CodingBat.string_2;

public class RepeatSeparator {
    public static void main(String[] args) {
        String word = "Word",
               sep = "X",
               res = word;
        int count = 3;

        for (int i = 1; i < count; i++) res += sep + word;

        System.out.println((count != 0) ? res : "");
    }
}
