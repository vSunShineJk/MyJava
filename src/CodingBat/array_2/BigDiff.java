package CodingBat.array_2;

import java.util.Arrays;

public class BigDiff {
    public static void main(String[] args) {

        // ----- Method 1 -------
        int[] nums = {10, 3, 5, 6};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int difference = nums[nums.length-1] - nums[0];
        System.out.println(difference);

        // ----- Method 2 -------

    }
}
