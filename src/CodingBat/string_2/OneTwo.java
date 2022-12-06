package CodingBat.string_2;

public class OneTwo {
    public static void main(String[] args) {
        String str = "tcagdo"; // catdog

        String res = "";
        for (int i = 0, j = 0, k = 1; i < str.length(); i++) {
            if (j < str.length() && k < str.length()) {
                res += str.charAt(k);
                k++;
                res += str.charAt(k);
                k--;
                res += str.charAt(j);
                j += 2;
            }
        }
        System.out.println(res);
    }
}
