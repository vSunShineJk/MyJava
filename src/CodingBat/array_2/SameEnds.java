package CodingBat.array_2;

import java.util.Arrays;

public class SameEnds {

    public boolean sameEnds(int[] nums, int len) {
        int[] first = new int[len];
        int[] second = new int[len];

        for (int i = 0, j = len; i < len && j > 0; i++, j--){
            first[i] = nums[i];
            second[i] = nums[nums.length-j];
        }

        return Arrays.equals(first, second);
    }


    public static void main(String[] args) {
        SameEnds obj = new SameEnds();
        System.out.println(obj.sameEnds(new int[]{}, 0));
    }

}
