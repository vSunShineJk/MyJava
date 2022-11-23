package MySelfStudying.concepts_OOP.Abstraction.withAbu;

public class CircleScanner extends AreaScanner implements SchoolScanner, SupermarketScanner{
    public CircleScanner(String range) {
        super(range);
    }

    @Override
    public void scan() {
        System.out.println("scanning circle area");
    }

    @Override
    public void faceScan() {
        System.out.println("Scanning face");
    }

    @Override
    public void productScan() {
        System.out.println("Scanning circle shape products");
    }
}
