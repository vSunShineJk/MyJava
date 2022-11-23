package MySelfStudying.loops.Practice;

public class Tree {
    public static void main(String[] args) {

        int year = 0;
        int growth = 1;
        int size = 0;

        for (int i = 10; i > 0; i-- ){

            year += 1;
            size += 1;

            System.out.println("year " + year + " - " + "growth " + growth + " cm");
            System.out.println("tree size: " + size + " cm");

            if (year >= 3){
                growth = 2;
                size += 1;
            }

        }

    }
}
