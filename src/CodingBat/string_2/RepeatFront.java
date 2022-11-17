package CodingBat.string_2;

public class RepeatFront {
    public static void main(String[] args) {
        String str = "Chocolate",
               res = "";
        int n = 4;

        for (int i = 0; i < n; i++) res += str.substring(0,n-i);

        System.out.println(res);
    }
}
