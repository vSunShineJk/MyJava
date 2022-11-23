package MySelfStudying.loops;

public class WhileForEven {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 20){
            if (num%2 == 0){
                System.out.print(num+" ");
            }
            num++;
        }

        System.out.println();

        int secondNum = 1;
        while(secondNum <= 20){
            if(secondNum%2 == 1){
                System.out.print(secondNum +" ");
            }
            secondNum++;
        }

    }
}
