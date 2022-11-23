package interviewTasks;

public class practice {
    public static void main(String[] args) {
        System.out.println(Alp("qwertyuiopasdfghjklzxcvbnm"));
    }

    public static String Alp(String str){
        StringBuilder store = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'e' &&
                str.charAt(i) != 'u' &&
                str.charAt(i) != 'o' &&
                str.charAt(i) != 'a' &&
                str.charAt(i) != 'i') store.append("").append(str.charAt(i));
        }

        return store.toString();
    }
}
