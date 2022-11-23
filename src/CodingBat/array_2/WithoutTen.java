package CodingBat.array_2;

import java.util.Arrays;

public class WithoutTen {

    public int[] withoutTen(int[] nums) { // 1, 10, 10, 2
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (nums[i] != 10){
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        WithoutTen obj = new WithoutTen();
        System.out.println(Arrays.toString(obj.withoutTen(new int[]{10, 2, 10})));
    }

}
