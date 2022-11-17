package CodingBat.AP_1;

public class UserCompare {
    public static void main(String[] args) {
        String aName = "adam", bName = "bob";
        int aId = 1, bId = 2;

        int difference = aName.compareTo(bName);
        if (difference < 0) difference = -1;
        else if (difference == 0){
            if (aId > bId) difference = 1;
            else if (aId < bId) difference = -1;
            else difference = 0;
        }
        else difference = 1;
        System.out.println(difference);
    }
}
