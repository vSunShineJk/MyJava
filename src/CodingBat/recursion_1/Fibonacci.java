package CodingBat.recursion_1;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fibonacci(1));
    }

    public int fibonacci(int n) {

        int sum = 0,
            first = 0,
            second = 1;

        if(n != 1) {
            for (int i = 1; i < n; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
        }else {
            for (int i = 1; i <= n; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
        }
        return sum;
    }
}
