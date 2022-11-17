package CodingBat.string_2;

public class RepeatEnd {
    public static void main(String[] args) {

        String str = "Hello",
               res = "";
        int n = 1;

        for (int i = 0; i < n; i++) res += str.substring(str.length()-n) ;

        System.out.println(res);
    }
}
