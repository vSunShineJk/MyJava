package MySelfStudying.strings;

public class Substring {
    public static void main(String[] args) {
        String str = "Good morning, my dear friend";
        //            0123456789

        int div = str.indexOf(",");
        String helloPart = str.substring(0, div);
        System.out.println(helloPart);

        String part2 = str.substring(14);
        System.out.println(part2);

        System.out.println(str); //   str.substring(0) == str

        int length = str.length();
        System.out.println(length);
        System.out.println(str.substring(4, str.length()));
        System.out.println(str.substring(4));
    }
}
