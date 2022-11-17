package CodingBat.warmup_2;

public class countXX {
    public static void main(String[] args) {
        String str = "Kittensxxx";

        int count = 0;
        for (int i = 0; i <= str.length()-2; i++) {
            if (str.substring(i,i+2).equals("xx")) count++;
        }

        System.out.println(count);
    }
}
