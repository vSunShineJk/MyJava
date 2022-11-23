package MySelfStudying.concepts_OOP.Abstraction.withAbu;

public abstract class AreaScanner {
    String range;

    public AreaScanner(String range) {
        this.range = range;
    }

    public abstract void scan();
}
