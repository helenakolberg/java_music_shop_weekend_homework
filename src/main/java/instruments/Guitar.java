package instruments;

import instruments.enums.Category;
import instruments.enums.StringType;
import instruments.enums.Type;

public class Guitar extends Instrument {

    private Type type;
    private StringType stringType;
    private int numOfStrings;

    public Guitar(Category category, String material, String colour, double buyingCost, double sellingPrice, Type type, StringType stringType, int numOfStrings) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.type = type;
        this.stringType = stringType;
        this.numOfStrings = numOfStrings;
    }

    public Type getType() {
        return type;
    }

    public StringType getStringType() {
        return stringType;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Wonderwall...";
    }
}
