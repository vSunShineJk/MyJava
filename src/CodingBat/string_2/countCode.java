package CodingBat.string_2;

public class countCode {
    public static void main(String[] args) {
        String str = "coAcodeBcoleccoreDD";

        int count = 0;
        if (str.length() > 2){
            for (int i = 0; i < str.length()-2; i++) {
                if (str.substring(i,i+2).equals("co") && i < str.length()-3){
                    i+=3;
                    if (str.charAt(i) == 'e') count++;
                    i-=3;
                }
            }
        }

        System.out.println(count);

    }
}
