package CodingBat.string_2;

public class GetSandwich {
    public static void main(String[] args) {

        String str = "xxbreadjam",
               res = "";
        if (str.indexOf("bread") != str.lastIndexOf("bread")) res += str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));

        System.out.println(res);
    }
}
