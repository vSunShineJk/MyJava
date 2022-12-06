package CodingBat.recursion_1;

public class PowerN {
    public int powerN(int base, int n) {
        int res = 0;
        if (n > 1){
            res = base * powerN(base,n-1);
        }else res = base;
        return res;
    }

    public static void main(String[] args) {
        PowerN powerN = new PowerN();
        System.out.println(powerN.powerN(3, 3));
    }
}
