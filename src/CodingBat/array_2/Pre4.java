package CodingBat.array_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pre4 {

    public int[] pre4(int[] nums) {
        // 1, 3, 4, 2, 4
        List<Integer> list = new ArrayList<>();
        for (int each : nums) {
            if (each != 4) list.add(each);
            else break;
        }
        Integer[] array = list.toArray(new Integer[0]);
        int[] trueArr = new int[array.length];

        for (int i = 0; i < trueArr.length; i++) {
            trueArr[i] = array[i];
        }

        return trueArr;
    }

    public static void main(String[] args) {
        Pre4 obj = new Pre4();
        System.out.println(Arrays.toString(obj.pre4(new int[]{1, 3, 4, 2, 4})));
    }
}
