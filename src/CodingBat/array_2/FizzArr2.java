package CodingBat.array_2;

import java.util.Arrays;

public class FizzArr2 {
    public static void main(String[] args) {
        int n = 10;

        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = ""+i;
        }
        System.out.println(Arrays.toString(strArr));
    }
}
