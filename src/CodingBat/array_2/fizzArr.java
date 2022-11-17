package CodingBat.array_2;

import java.util.Arrays;

public class fizzArr {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];

        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = num;
            num++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
