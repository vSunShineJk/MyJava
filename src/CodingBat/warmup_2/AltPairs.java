package CodingBat.warmup_2;

public class AltPairs {
    public static void main(String[] args) {
        String str = "Chocolate";

        String str2 = "";
        for(int i = 0, j = 1; i < str.length(); i+=4, j+=4){
            str2 += "" + str.charAt(i);
            if (j < str.length())
             str2 += "" + str.charAt(j);
        }

        System.out.println(str2);
    }
}
