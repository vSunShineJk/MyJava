package CodingBat.array_2;

import java.util.Arrays;

public class ZeroFront {

    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0,j = arr.length-1; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[j] = nums[i];
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ZeroFront obj = new ZeroFront();
        System.out.println(Arrays.toString(obj.zeroFront(new int[]{1, 0})));
    }

}
