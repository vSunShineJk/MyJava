package CodingBat.string_2;

public class ZipZap {
    public static void main(String[] args) {
        String str = "zzzopzop",
               res = "";

        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'z' && str.charAt(i += 2) == 'p') res += "zp";
                else {
                    i -= 2;
                    res += str.charAt(i);
                }
            }
        }
        System.out.println(res);
    }
}
