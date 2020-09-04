package instruments;

public class Guitar extends Instrument {

    private Type type;
    private String stringType;
    private int numOfStrings;

    public Guitar(Category category, String material, String colour, double buyingCost, double sellingPrice, Type type, String stringType, int numOfStrings) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.type = type;
        this.stringType = stringType;
        this.numOfStrings = numOfStrings;
    }

    public Type getType() {
        return type;
    }

    public String getStringType() {
        return stringType;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Wonderwall...";
    }
}
