package MySelfStudying.concepts_OOP.Abstraction.withAbu;

public class SquareScanner extends AreaScanner{

    public SquareScanner(String range) {
        super(range);
    }

    @Override
    public void scan() {
        System.out.println("scanning square area");
    }
}
