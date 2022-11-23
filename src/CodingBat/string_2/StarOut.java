package CodingBat.string_2;

public class StarOut {
    public static void main(String[] args) {
        StarOut obj = new StarOut();
        System.out.println(obj.starOut("ab**cd"));
    }

    public String starOut(String str) {

        String res = "";
        if (str.contains("*")){
            res = str.replace(str.substring(str.indexOf('*')-1,str.indexOf('*')+2),"");
        }

        return res;
    }
}
