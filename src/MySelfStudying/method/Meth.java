package MySelfStudying.method;

public class Meth {

    // implementation of the method --> this basically what a method does; So it means everything inside a body IS an implementation of the method

    // parantathies -- brackets after a name of the method
    // inside bracket/parantathies we write parameters

    // parameters -- variables with any data type which we provide inside a brackets of a method

    // arguments -- value of parameters when we call a method


    public static void name() {

        System.out.println("Hello World");

    }
    // printing "Hello World" --> this is the implementation of the method name()


    public static void printNumber(int a) { // int a is a parameter
        System.out.println(a);
    }

    public static void sum(int a, int b){
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        name(); name(); name();

        printNumber(123); // value 123 is an argument

        sum(12,21);
        sum(14, 10);

        int a = 12;
        int b = 21;
        System.out.println(a+b);

        int c = 14;
        int d = 15;
        System.out.println(c+d);
    }


    // Q: why use methods??????????????????????????????????????????????????????????

    // A: 1) gives us a reuse-ability of the code
    //    2) makes our code more readable
    //    3) saves the memory

}

