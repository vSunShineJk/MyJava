package CodingBat.string_2;

public class BobThere {
    public static void main(String[] args) {
        String str = "abcbob";

        boolean isBob = false;

        for(int i = 0; i < str.length()-2; i++){
            if(str.charAt(i) == 'b'){
                i+=2;
                if (str.charAt(i) == 'b') isBob = true;
                i-=2;
            }
        }

        System.out.println(isBob);
    }
}
