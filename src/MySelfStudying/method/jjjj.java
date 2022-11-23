package MySelfStudying.method;

import java.util.Scanner;

public class jjjj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }

    public static double waterTax(double units){
        double bill = 0;
        if (units <= 50){
            bill = units * 0.60;
        } else if (units > 50 && units < 100) {
            bill = units * 0.90;
        } else if (units > 100 && units < 150) {
            bill = units * 0.90 + 50;
        } else if (units > 150) {
            bill = units * 0.90 + 100;
        }
        return bill;
    }
}
