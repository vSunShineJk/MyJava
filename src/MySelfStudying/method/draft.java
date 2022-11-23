package MySelfStudying.method;

public class draft {
    public static void main(String[] args) {
        String h = "java";
        String k = "";
        for (int i = h.length()-1; i >= 0; i--){
            char ch = h.charAt(i);
            k += ch;
        }
        System.out.println(k);
    }
}
