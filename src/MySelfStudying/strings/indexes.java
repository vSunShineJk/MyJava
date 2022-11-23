package MySelfStudying.strings;

public class indexes {
    public static void main(String[] args) {
        String name = "Abubakr";
        //             0123456

        /*
        System.out.println(name.charAt(7));
        ERROR: StringIndexOutOfBoundsException
         */

        int nameLength = name.length();
        System.out.println("the length of name: " + nameLength);
        int in = name.indexOf("u");
        System.out.println("the index of 'u': " + in);
        // .indexOf("u")
        // this method returns the index of certain character

        char ch = name.charAt(2);
        System.out.println(".charAt() method: " + ch);
        // method charAt() returns the character of certain index


        System.out.println("---------------------------------");
        String word = "Unacceptable";
        //             01234
        System.out.println("The first letter: " + word.charAt(0));
        int wordLen = word.length(); // 5
        System.out.println("The last letter: " + word.charAt(wordLen-1));


        String name2 = "Abubakr";
        //              01234567
        System.out.println(name2.indexOf("b"));
        System.out.println(name2.lastIndexOf("b"));
        System.out.println(name2.indexOf("b", 2));

        System.out.println(name2.indexOf("a"));


    }
}
