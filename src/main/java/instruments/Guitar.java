package instruments;

public class Guitar extends Instrument {

    private String type;
    private String stringType;
    private int numOfStrings;

    public Guitar(String category, String material, String colour, double buyingCost, double sellingPrice, String type, String stringType, int numOfStrings) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.type = type;
        this.stringType = stringType;
        this.numOfStrings = numOfStrings;
    }

    public String getType() {
        return type;
    }

    public String getStringType() {
        return stringType;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String play() {
        return "Wonderwall...";
    }
}
