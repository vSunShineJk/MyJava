package CodingBat.array_2;

import java.util.Arrays;

public class TenRun {

    public int[] tenRun(int[] nums) {
        // 2, 10, 3, 4, 20, 5

        for (int i = 0; i < nums.length; i++) {
            int each = nums[i]/10;
            if (each > 0){
                while (nums[i]/10 < each){
                    nums[i] = each*10;
                    i++;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        TenRun obj = new TenRun();
        System.out.println(Arrays.toString(obj.tenRun(new int[]{2, 10, 3, 4, 20, 5})));
    }
}
