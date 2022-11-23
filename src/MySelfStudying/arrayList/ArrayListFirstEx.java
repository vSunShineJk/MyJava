package MySelfStudying.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListFirstEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("apple");
        list.add("pineapple");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);
        list.remove("pineapple");
        System.out.println(list);


        System.out.println("------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        System.out.println(numbers);
        numbers.add(0, 11);
        System.out.println(numbers);
        numbers.set(2, 13);
        System.out.println(numbers);

        System.out.println("------------------------------------");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('j');
        chars.add('a');
        chars.add('V');
        chars.add('a');
        System.out.println(chars);

        int a = 12;
        Integer i = 12;

        System.out.println("------------------------------------");
        System.out.println(Character.isAlphabetic('3'));
        System.out.println(Character.isDigit('3'));

        ArrayList<Boolean> booleans = new ArrayList<>();




        /*

        ArrayList vs array[]

        Similarities:
        both of them can store several fields in one box

        both of them have length
        we may define the type of the object

        Differences:
        array has no any own methods but Arraylist has a lot

        simple array has fixed length, which cannot be changes once it assigned

        ArrayList is more dynamic, and we can change its length, and manipulate with data using methods like add() or remove() ;


        we cannot add objects after assigning the value of the length however in arrayList we can add
        in array there is no removing function but in ArrayList has

        simple array support both primitive and non-primitive data types, but ArrayList can only hold non-primitive data types which means we are using Wrapper Classes here;

        Wrapper classes: Integer, Character, Long, Short etc.
        Basically wrapper classes are object versions of primitive data types

        in array we may use primitive data types but in Arraylist we use a lit bit similar datatype which are non-primitive
        to print all values of the simple array we always must use Arrays.toString(); but in ArrayList we don't need.


         */
    }
}
