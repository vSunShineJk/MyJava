package FlipGrid;

public class Difference_EqualsMethodAndEqual_Operator {
    public static void main(String[] args) {


        System.out.println("<--- the concept of == operator --->");
        // --------------------------------- the concept of == operator ---------------------------------------
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("s1 == s2 = " + (s1 == s2)); // true
        System.out.println("s1 == s3 = " + (s1 == s3)); // false
        System.out.println("s1.equals(s2) = " + (s1.equals(s2))); // true
        System.out.println("s1.equals(s3) = " + (s1.equals(s3))); // true
        System.out.println();
        System.out.println("hello" == "hello"); // true
        System.out.println("hello" == new String("hello")); // false
        System.out.println("hello".equals("hello"));
        System.out.println("hello".equals(new String("hello")));

        System.out.println("<--- == operator for compatible data types --->");
        // --------------------------------- == operator for compatible data types ---------------------------------
        // integer-type
        System.out.println(10 == 20);
        // char-type
        System.out.println('a' == 'b');
        // char and double type
        System.out.println('a' == 97.0);
        // boolean type
        System.out.println(true == true);


        System.out.println("<--- == operator for incompatible data types --->");
        // --------------------------------- == operator for incompatible data types ---------------------------------

        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");

        System.out.println(t == o);
        System.out.println(o == s);

        // Uncomment to see error
        // System.out.println(t==s); // error: incomparable types: java.lang.Thread and java.lang.String


    }
}
