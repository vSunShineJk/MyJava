package CodingBat.string_2;

public class xyzMiddle {

    public static void main(String[] args) {
        String str = "AAxyzBBB";
        System.out.println("str.length() = " + str.length());

        System.out.println("str.charAt(str.length()/2) = " + str.charAt(str.length() / 2));

        boolean isInTheMiddle = false;
        if (str.length() > 2) isInTheMiddle = str.charAt(str.length() / 2) == 'y' || str.charAt(str.length() / 2) == 'z';

        System.out.println(isInTheMiddle);
    }
}
