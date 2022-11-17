package CodingBat.array_2;

public class IsEveryWhere {
    public static void main(String[] args) {
        int[] nums = {};
        int val = 2;
        boolean isEvery = true;


            for (int i = 0; i < nums.length; i += 2) {
                if (nums[i] == val) isEvery = true;
                else {
                    for (int j = 1; j < nums.length; j += 2) {
                        if (nums[j] == val) isEvery = true;
                        else {
                            isEvery = false;
                            break;
                        }
                    }
                }
            }

        System.out.println(isEvery);
    }
}
