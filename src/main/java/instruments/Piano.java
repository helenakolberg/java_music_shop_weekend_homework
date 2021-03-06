package instruments;

import instruments.enums.Category;
import instruments.enums.Type;

public class Piano extends Instrument {

    private Type type;
    private int numOfKeys;

    public Piano(Category category, String material, String colour, double buyingCost, double sellingPrice, Type type, int numOfKeys) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.type = type;
        this.numOfKeys = numOfKeys;
    }

    public Type getType() {
        return this.type;
    }

    public int getNumOfKeys() {
        return this.numOfKeys;
    }

    public String play() {
        return "Für Elise...";
    }
}
