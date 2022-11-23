package MySelfStudying.strings.tasks;

public class Task2 {
    // String = "skdjhfskjhfdkswj-_-hdfksjhfksdjhfksjdfhkjh";
    // BOOM!
    // safe

    // str = |lsdkjskdjflskjfl
    // safe

    // str = "sldkfj-_-sodfipodfpsoidfpsoidfoi-_-sdfsdkjfs"
    // BOOM!

    public static String findSpy(String str) {
        if (str.contains("-_-")){
            return "BOOM!";
        } else {
            return "safe";
        }
    }

    public static void main(String[] args) {
        System.out.println(findSpy("jhguujj"));
    }
}
