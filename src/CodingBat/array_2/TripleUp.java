package CodingBat.array_2;

public class TripleUp {

    public boolean tripleUp(int[] nums) {

        boolean isTriple = false;
        for (int i = 0; i < nums.length; i++) {
            if(i+2 < nums.length && nums[i] == nums[i+1]-1 && nums[i] == nums[i+2]-2)isTriple = true;
        }

        return isTriple;
    }

    public static void main(String[] args) {
        TripleUp obj = new TripleUp();
        System.out.println(obj.tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
    }
}
