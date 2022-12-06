package CodingBat.array_2;

public class ModThree {
    public boolean modThree(int[] nums) {
        int count = 0;
        boolean isThree = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]%2==0){ //2, 4, 2, 5
                while (nums[i]%2==0 && i < nums.length-1){
                    count++;
                    i++;
                }
            } else {
                while (nums[i]%2==1 && i < nums.length-1){
                    count++;
                    i++;
                }
            }
        }
        if (count == 3) isThree = true;
        return isThree;
    }

    public static void main(String[] args) {
        ModThree obj = new ModThree();
        System.out.println(obj.modThree(new int[]{2,1,2,5}));
    }
}
