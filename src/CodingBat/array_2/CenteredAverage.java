package CodingBat.array_2;

import java.util.Arrays;

public class CenteredAverage {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,100};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for (int i = 1; i < nums.length-1; i++) {
           sum += nums[i];
        }
        int centeredAverage = sum/(nums.length-2);
        System.out.println(centeredAverage);
    }
}
