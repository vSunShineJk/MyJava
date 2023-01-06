package CodingBat.array_2;

public class TripleUp {

    public boolean tripleUp(int[] nums) {
        // 1, 2, 3

        boolean isTriple = false;
        for (int i = 0; i < nums.length; i++) {
            isTriple = (nums[i] == nums[i+1]-1 && nums[i] == nums[i+2]-2);
            if (isTriple) break;
        }

        return isTriple;
    }

    public static void main(String[] args) {
        TripleUp obj = new TripleUp();
        System.out.println(obj.tripleUp(new int[]{1, 2, 4, 4}));
    }
}
