package CodingBat.logic_2;

public class MakeChoco {
    public static void main(String[] args) {

        int small = 1000,
            big = 1000_000,
            goal = 5000_006,

            numOfBig = goal/5,
            numOfSmall = goal%5,
            res = -1,
            withSmall1 = small/5,
            withSmall2 = small%5;


        if (big >= numOfBig && small >= numOfSmall) res = numOfSmall;
        else if (withSmall1 + big >= numOfBig && withSmall2 >= numOfSmall) res = (numOfBig - big)*5 + numOfSmall;
        else if (withSmall1 + big >= numOfBig && withSmall2 == 0) res = (numOfBig - big)*5 + numOfSmall;

        System.out.println("numOfBig: " + numOfBig + "\nnumOfSmall: " + numOfSmall + "\nwithSmall1: " + withSmall1 + "\nwithSmall2: " + withSmall2 + "\nres: " + res);
    }
}
