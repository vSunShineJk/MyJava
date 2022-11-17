package CodingBat.AP_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwo {
    public static void main(String[] args) {
        String[] a = {"a", "c", "z"};
        String[] b = {"c", "f", "z"};
        int n = 3;

        Set<String> all = new HashSet<>();
        for (int i = 0, j = 0; i < a.length + b.length && j < b.length; i++) {
            if(i < a.length) all.add(a[i]);
            else{
                all.add(b[j]);
                j++;
            }
        }
        String[] newArr = all.toArray(new String[n]);

        String[] newArr2 = new String[n];
        for (int i = 0; i < n; i++) {
            newArr2[i] = newArr[i];
        }

        System.out.println(Arrays.toString(newArr2));
    }
}
