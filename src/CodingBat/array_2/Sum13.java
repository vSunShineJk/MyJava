package CodingBat.array_2;

public class Sum13 {
    public static void main(String[] args) {
        int[] nums = {13,2,1,13,1,2,13};

        int sum = 0;
        if(nums.length!=0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=13) sum += nums[i];
                else i+=1;
            }
        }
        System.out.println(sum);
    }
}

