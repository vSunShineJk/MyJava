package CodingBat.array_2;

public class TwoTwo {

    public boolean twoTwo(int[] nums) {
        boolean twoTwo = true;
        if (nums.length != 0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 2){
                    i++;
                    if (i < nums.length && nums[i] == 2){
                        twoTwo = false;
                        break;
                    }
                    i--;
                }
            }
        }
        return twoTwo;
    }

    public static void main(String[] args) {
        TwoTwo twoTwo = new TwoTwo();
        System.out.println(twoTwo.twoTwo(new int[]{2,2,4,2,2}));
    }
}
