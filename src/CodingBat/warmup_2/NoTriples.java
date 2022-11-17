package CodingBat.warmup_2;

public class NoTriples {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 1};

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                count++;
            }
        }

        System.out.println(count==0);
    }
}
