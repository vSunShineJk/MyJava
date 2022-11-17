package CodingBat.string_2;

public class StarOut {
    public static void main(String[] args) {

        String str = "*str*in*gy";

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i != 0 && i != str.length()-1){
                sb.delete(i-1,i+1);
                i+=3;
            }
        }

        System.out.println(sb);
    }
}
