package CodingBat.array_2;

public class ModThree {

    public boolean modThree(int[] nums) { // nums = 999
        boolean modThree = false;

        if(nums.length >= 3) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 1) {
                    i++;
                    if (i < nums.length && nums[i] % 2 == 1) {
                        i++;
                        if (i < nums.length && nums[i] % 2 == 1) {
                            i++;
                            modThree = true;
                        } else i--;
                    } else i--;
                } else {
                    i++;
                    if (i < nums.length && nums[i] % 2 == 0) {
                        i++;
                        if (i < nums.length && nums[i] % 2 == 0) {
                            i++;
                            modThree = true;
                        } else i--;
                    } else i--;
                }
            }

        }
        return modThree;
    }

    public static void main(String[] args) {
        ModThree modThree = new ModThree();
        System.out.println(modThree.modThree(new int[]{2, 1, 2, 5}));
    }
}
