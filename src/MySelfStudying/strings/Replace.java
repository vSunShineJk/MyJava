package MySelfStudying.strings;

public class Replace {
    public static void main(String[] args) {

        String sentece = "hello the shiny day";
        System.out.println(sentece.length());
        System.out.println(sentece);

        System.out.println(sentece.replace(" ",""));

        System.out.println(sentece);

        sentece = sentece.replace(" ", "");

        System.out.println(sentece);
        System.out.println(sentece.length());
    }
}
