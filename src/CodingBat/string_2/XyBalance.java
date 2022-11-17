package CodingBat.string_2;

public class XyBalance {
    public static void main(String[] args) {
        String str = "12xabxxydxyxyzz"; // yxyxyxyx
        //            0123456789

        boolean isBalanced = false;
        if (str.lastIndexOf('y') > str.lastIndexOf('x')) isBalanced = true;

        System.out.println(isBalanced);
    }
}
