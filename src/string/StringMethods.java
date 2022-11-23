package string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // 1 // .compareTo()
        String str1 = "hi", str2  = "hello";
        System.out.println(str1.compareTo(str2));

        // 2 // .format()
        String str3 = "soon";

        String str4 = String.format("%s", str3);
        String str5 = String.format("%b",str3);
        //String str6 = String.format("%c",'g');
        String str7 = String.format("%d",67);
        String str8 = String.format("%h",'w');
        String str9 = String.format("Line%ndoes%nit%nseparating");
        String str10 = String.format("%o",23);
        String str11 = String.format("%s",true);
        //--------------------------------------
        String str12 = String.format("%10d",10);
        String str13 = String.format("%10d",2);
        String str14 = String.format("%10s",444);

        System.out.println(str4);
        System.out.println(str5);
        //System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);
        //-----------------------------------------
        System.out.println(str12);
        System.out.println(str13);
        System.out.println(str14);

        // 3 // .getBytes()
        String str15 = "abcdefgh";
        byte[] by = str15.getBytes();
        System.out.println(Arrays.toString(by));
        String str16 = new String(by);
        System.out.println(str16);

        // 4 // .intern()
        String str17 = "Hello world";
        String str18 = new String("Hello world");
        String str19 = str18.intern();

        System.out.println(str17 == str18);
        System.out.println(str18 == str19);
        System.out.println(str17 == str19);

        // 5 // .join()
        String data = String.join("/","11","12","2022");
        System.out.println(data);

        String firsName = "Umid", lastName = "Muminov", gender = "male";
        System.out.println(String.join(", ",firsName,lastName,gender));

        // 6 // .lastIndexOf()
        String str20 = "add some apple words to your String";
        System.out.println(str20.lastIndexOf('o'));

        // 7 // .split()
        String str21 = "java string split method by javatpoint";
        String[] strArr = str21.split(" ",2);
        System.out.println(Arrays.toString(strArr));

        // 8 // .toCharArray()
        String str22 = "hello";
        char[] strArr2 = str22.toCharArray();
        System.out.println(Arrays.toString(strArr2));

        // 9 // .trim()
        String str23 = "    trim      ";
        System.out.println(str23);
        System.out.println(str23.trim());

    }
}
