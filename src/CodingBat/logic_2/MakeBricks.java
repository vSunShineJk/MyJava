package CodingBat.logic_2;

public class MakeBricks {
    public static void main(String[] args) {

        int small = 20; // 20
        int big = 4;    // 0
        int goal = 39;  // 19

        boolean isPossible = false;

        if(small >= goal) isPossible = true;
        else {
            int byBig = goal/5,
                bySmall = goal%5;

            if(big >= byBig && small >= bySmall) isPossible = true;
            else {
                int withSmall = small/5,
                    withBag = small%5,
                    without = withSmall - Math.abs(byBig - big);

                if((big + withSmall >= byBig) && (withBag >= bySmall)) isPossible = true;
                else if(without*5 >= bySmall)isPossible = true;
            }
        }

        System.out.println(isPossible);
    }
}
