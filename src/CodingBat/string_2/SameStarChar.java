package CodingBat.string_2;

public class SameStarChar {
    public static void main(String[] args) {
        String str = "*66*66*";

        boolean isTheSame = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i != 0 && i != str.length()-1){
                isTheSame = str.charAt(i-1) == str.charAt(i+1);
            }
        }

        System.out.println(isTheSame);

    }
}
