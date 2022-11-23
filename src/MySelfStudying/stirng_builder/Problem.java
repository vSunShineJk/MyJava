package MySelfStudying.stirng_builder;

public class Problem {
    public static void main(String[] args) {
        String word = "apple";

        StringBuilder reversed = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        System.out.println(reversed);

        reversed.append(34).append('s').append(45.4).append(true);

        System.out.println(reversed);

        // elppa34s45.4true
        reversed.delete(0, reversed.indexOf("t"));

        System.out.println(reversed);

        // ['a', 'p', 'p', 'l', 'e']


        System.out.println(reversed.capacity());

        reversed.append("some more words");

        System.out.println(reversed.capacity());

        System.out.println(reversed);

        reversed.insert(4, ' ');

        System.out.println(reversed);

        String end_result = reversed.toString();

        System.out.println(end_result);
    }
}
