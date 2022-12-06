package CodingBat.recursion_1;

public class count7 {
//    static int count = 0;
    public static int count7(int n) {

        int count = 0;
        if(n/10 != 0){
            count = count7(n/10);
        } else {
            if (n % 10 == 7) count += 1;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("count7 = " + count7(771237));
    }
}
