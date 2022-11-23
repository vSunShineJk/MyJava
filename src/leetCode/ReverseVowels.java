package leetCode;

public class ReverseVowels {
//    public String reverseVowels(String s){
//
//    }

    public static void main(String[] args) {
        String s = "leetcode";
        //          edocteel
        // leotcede

        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(rev);

        for (int i = 0; i < rev.length(); i++) {
            if ((rev.charAt(i) < 'z' && rev.charAt(i) > 'a'));
        }
    }
}
