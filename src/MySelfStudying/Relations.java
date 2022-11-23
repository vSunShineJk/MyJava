package MySelfStudying;

public class Relations {
    public static void main(String[] args) {
        //    12 > 6
        int a = 12;
        int b = 6;

        boolean isBigger = 12 < 6;  // = false
        System.out.println(isBigger);

        boolean isEqual = a == b;

        // =
        int f = 100;
        f = 90;
        f = 70;
        int g = 0;
        g = f; // g = 70

        // ==
        boolean isEq = 10==10; // true
        System.out.println(isEq);


        // !
        boolean is = 10 != 10;   // false
        System.out.println("10 is not equals to 10? --> " + is);
        boolean is2 = 10 != 9;   // true
        System.out.println("10 is not equals to 9? --> " + is2);


        boolean isLess = !(9 > 10);   // true

        boolean isFalse = !false; // true
    }
}
