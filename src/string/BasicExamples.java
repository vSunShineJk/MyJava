package string;

public class BasicExamples {
    public static void main(String[] args) {

        char[] ch = {'j','a','v','a'}; // converting char Array to String
        String str = new String(ch);
        System.out.println(str);

        String str2 = "Strings"; // creating String by Java string literal
        System.out.println(str2);

        String str3 = new String("Strings"); // Creating Java String by NEW keyword
        System.out.println(str3);

        // String is immutable
        String firsName = "Umid";
        firsName.concat("Muminov"); //concat() method appends the string at the end
        System.out.println(firsName);

        String name = "Eric";
        name = name + "Erik";
        System.out.println(name);
        // --------------------
    }
}