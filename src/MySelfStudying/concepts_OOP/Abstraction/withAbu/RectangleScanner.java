package MySelfStudying.concepts_OOP.Abstraction.withAbu;

public class RectangleScanner extends AreaScanner implements SupermarketScanner{
    public RectangleScanner(String range) {
        super(range);
    }

    @Override
    public void scan() {
        System.out.println("scanning rectangle area");
    }

    @Override
    public void productScan() {
        System.out.println("scanning rectangle shape products");
    }
}
