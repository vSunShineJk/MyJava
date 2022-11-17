package CodingBat.warmup_2;

public class DoubleX {
    public static void main(String[] args) {
        String str = "aaaax";

        boolean isDouble = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x'){
                i++;
                if ( i < str.length() && str.charAt(i) == 'x'){
                    isDouble = true;
                    break;
                } else break;
            }
        }

        System.out.println(isDouble);
    }
}
