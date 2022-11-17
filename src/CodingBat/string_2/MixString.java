package CodingBat.string_2;

public class MixString {
    public static void main(String[] args) {

        String a = "Hi",
               b = "There",
               longest = "",
               str = "";

        int len = 0;
        if (a.length()>b.length()){
            len = b.length();
            longest = a;
        } else{
            len = a.length();
            longest = b;
        }

        for (int i = 0; i < len ; i++) {
            str += "" + a.charAt(i) + b.charAt(i);
        }

        System.out.println(str+longest.substring(len));
    }
}
