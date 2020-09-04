package instruments;

public class Piano extends Instrument {

    private Type type;
    private int numOfKeys;

    public Piano(Category category, String material, String colour, double buyingCost, double sellingPrice, Type type, int numOfKeys) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.type = type;
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "Für Elise...";
    }

    public Type getType() {
        return this.type;
    }
}
