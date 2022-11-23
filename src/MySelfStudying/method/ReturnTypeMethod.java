package MySelfStudying.method;

import java.util.Scanner;

public class ReturnTypeMethod {
    public static void main(String[] args) {
        int c = getNumber(12);

        System.out.println(c);

        String word = getWord("apple");
        System.out.println(word);

        System.out.println(getNumber(52));
        System.out.println(getWord("Tree"));

        System.out.println(getWord("Tree").toUpperCase());


        System.out.println(isEven(98));

        Scanner sc = new Scanner(System.in);
        if (isEven(sc.nextInt())) {
            System.out.println("This number is even! ");
        } else {
            System.out.println("This number is odd! ");
        }


    }

    public static void printWord(String word) {
        System.out.println(word);
    }



//  public --> access modifier
//  static --> не обращай внимания!!!!!!!!!!!!!!!!!!!
//  int    --> return type
    public static int getNumber(int a) {
        return a;
    }

    public static String getWord(String word) {
        return word;
    }

    public static boolean isEven(int d) {
        if (d%2==0) return true;

        else
            return false;
    }
}

// just like variables, each method has a data type!!! Whe call it 'return type'
// if method's return type is VOID it means it has not return type.


// void method VS return type method

/*
     -- return type method make our code process easier
     -- and make coding more dynamic
     -- helps to reuse a code more!
 */