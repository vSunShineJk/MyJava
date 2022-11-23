package CodingBat.array_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Post4 {

    public int[] post4(int[] nums) {

        ArrayList<Integer> arrL = new ArrayList<>();
        int index = nums.length-1;
        for(int i = 0; i <= index-1; i++){
            if(nums[index-i] != 4) arrL.add(nums[index-i]);
            else break;
        }
        int[] arr = new int[arrL.size()];
        for (int i = 0, j = arrL.size()-1; i < arrL.size() && j >= 0; i++,j--) {
            arr[j] = arrL.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Post4 bj = new Post4();
        System.out.println(Arrays.toString(bj.post4(new int[]{2, 4, 1, 4, 3, 2})));
    }

}
