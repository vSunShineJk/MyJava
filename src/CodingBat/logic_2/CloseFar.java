package CodingBat.logic_2;

public class CloseFar {
    public static void main(String[] args) {
        int a = 4,
            b = 5,
            c = 3;

        boolean isClose = false;
        if(Math.abs(a-b)<=1 && Math.abs(b-c)>=2 && Math.abs(a-c)>=2) isClose = true;
        else if (Math.abs(a-c)<=1 && Math.abs(c-b)>=2 && Math.abs(a-b)>=2) isClose = true;

        System.out.println(isClose);
    }
}
