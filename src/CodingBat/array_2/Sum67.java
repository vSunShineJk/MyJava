package CodingBat.array_2;

public class Sum67 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};

        int sum = 0;
        if (nums.length!=0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=6) sum += nums[i];
                else while (nums[i]!=7) i+=1;
            }
        }
        System.out.println(sum);
    }
}
