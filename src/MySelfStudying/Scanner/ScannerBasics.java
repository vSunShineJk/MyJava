package MySelfStudying.Scanner;

import java.util.Scanner;

public class ScannerBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // object
        // Scanner is a class
        // classes have methods
        // method is part of a class that can be reused in other places

        int number = input.nextInt();
        System.out.println("the value of number is = " + number);

        byte b = input.nextByte();
        System.out.println("the value of your byte is = " + b);

        String name = input.next();
        System.out.println("Your name is " + name);
        input.nextLine();


        String name1 = input.nextLine();
        System.out.println("Your name is " + name1);
    }
}
