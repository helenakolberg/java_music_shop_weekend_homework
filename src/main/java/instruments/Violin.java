package instruments;

import instruments.enums.Category;
import instruments.enums.StringType;

public class Violin extends Instrument {

    private StringType stringType;

    public Violin(Category category, String material, String colour, double buyingCost, double sellingPrice, StringType stringType) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.stringType = stringType;
    }

    public StringType getStringType() {
        return stringType;
    }

    public String play() {
        return "The Bach Chaconne in D Minor...";
    }
}
