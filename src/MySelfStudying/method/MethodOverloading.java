package MySelfStudying.method;

import java.lang.String; // --> java.lang be default always in our hearts

public class MethodOverloading {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }


    public static String add(String a, String b) {
        return a+b;
    }

    // method overloading: it is when we create the method with the same name, BUT with different parameters

    /*
            why method overloading????

            - more readability
            - makes coding easier


            examples of method overloading in java.lang :

            String.substring()
            String.indexOf()

            ArrayList.add()
     */

}
