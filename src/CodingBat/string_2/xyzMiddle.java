package CodingBat.string_2;

public class xyzMiddle {

    public static void main(String[] args) {
        String str = "xyzAxyzBxyz";
        String part1 = str.substring(0,str.indexOf("xyz"));
        String part2 = str.replace(part1+"xyz","");

        System.out.println(Math.abs(part1.length()-part2.length()) <= 1);
        System.out.println(part1);
        System.out.println(part2);

        System.out.println(str.lastIndexOf("xyz",str.indexOf("xyz")) + " " + str.lastIndexOf("xyz"));
    }
}
