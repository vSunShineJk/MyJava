package MySelfStudying.arrayList;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {
        int[] a; // declare an array of int with variable 'a'

        a = new int[3]; // {0, 0, 0}

        a[0] = 2;
        a[1] = 43;
        a[2] = 6;

        //   {2, 43, 6}

        int[] b; // declare an array of int with variable 'a'
        b = new int[] {1,5,7,4};

        int[] c = {12,2,4};


        String[] s = new String[4];
        System.out.println(Arrays.toString(s));
    }
}
