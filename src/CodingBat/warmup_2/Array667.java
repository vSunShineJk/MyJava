package CodingBat.warmup_2;

public class Array667 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 6, 7};

        int count = 0;
        for(int i = 0; i <= nums.length; i++){
            if(i < nums.length && nums[i]==6){
                i++;
                if(i < nums.length && (nums[i] == 6 || nums[i] == 7)){
                    count++;
                    i--;
                }
            }
        }

        System.out.println(count);
    }
}
