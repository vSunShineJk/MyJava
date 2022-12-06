package CodingBat.string_2;

public class xyzMiddle {

    public static void main(String[] args) {
        String str = "xyz";

        int numOfXYZ = str.replace("xyz","x").length() - str.replace("xyz","").length();
        boolean isMiddle = false;

        if (numOfXYZ <= 1) {
            String part1 = str.substring(0, str.indexOf("xyz"));
            String part2 = str.substring(str.indexOf("xyz")).replace("xyz", "");
            isMiddle = Math.abs(part1.length() - part2.length()) <= 1;
        }

        System.out.println(isMiddle);
        System.out.println(numOfXYZ);
        System.out.println();

        //System.out.println(7 < 8 ^ 9 > 10);
    }

//    public static boolean xyzMiddle(String str) {
//        if(str.length() > 2){
//            String part1 = str.substring(0,str.indexOf("xyz"));
//            String part2 = str.replace("xyz","");
//            return Math.abs(part1.length()-part2.length()) <= 1;
//        } else return false;
//    }
}
