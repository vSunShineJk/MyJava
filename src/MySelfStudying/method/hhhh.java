package MySelfStudying.method;
import java.util.Scanner;
public class hhhh {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        return isAvailable && month == 2 && day >= 1 && day <= 8 && year == 2018;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
