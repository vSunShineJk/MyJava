package MySelfStudying.concepts_OOP.Abstraction.withAbu;

public class TestScanners {
    public static void main(String[] args) {
        CircleScanner circleScanner = new CircleScanner("100km");
        circleScanner.scan();
        circleScanner.faceScan();
        circleScanner.productScan();

        RectangleScanner rectangleScanner = new RectangleScanner("90km");
        rectangleScanner.scan();
        rectangleScanner.productScan();

        // AreaScanner a = new AreaScanner(); // DOES NOT COMPILE (compile time error)
        // we cannot instantiate - (create object) of abstract class

        /*

        class -- blueprint/scheme of the object.
        object -- is an instance of the class
        abstract class -- blueprint/scheme of the class

         */
    }
}
