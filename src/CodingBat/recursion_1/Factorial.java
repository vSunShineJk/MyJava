package CodingBat.recursion_1;

public class Factorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("obj.factorial(5) = " + obj.factorial(5));
    }
    public int factorial(int n) {
        int f = 1; // 5
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
