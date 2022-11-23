package MySelfStudying.concepts_OOP.Abstraction.withOmar;

public class AbcExtended extends Abc{
    @Override
    public boolean isAble(int age) {
        return age == 18?true:false;
    }

    public static void main(String[] args) {
        Abc now = new AbcExtended();
    }
    public void car(){}


}
