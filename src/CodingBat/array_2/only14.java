package CodingBat.array_2;

public class only14 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 4};
        boolean is1or4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1||nums[i]==4)is1or4 = true;
            else {
                is1or4 = false;
                break;
            }
        }

        System.out.println(is1or4);
    }
}
