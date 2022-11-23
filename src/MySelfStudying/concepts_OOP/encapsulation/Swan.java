package MySelfStudying.concepts_OOP.encapsulation;

public class Swan {
    private int numberOfEggs;

    public void setNumberOfEggs(int eggs) {
        if (eggs >= 0) {
            numberOfEggs = eggs;
        }
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }
}
