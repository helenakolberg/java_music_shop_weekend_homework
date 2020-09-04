package instruments;

import instruments.enums.Category;

public class FrenchHorn extends Instrument {

    private double bellDiameter;

    public FrenchHorn(Category category, String material, String colour, double buyingCost, double sellingPrice, double bellDiameter) {
        super(category, material, colour, buyingCost, sellingPrice);
        this.bellDiameter = bellDiameter;
    }

    public double getBellDiameter() {
        return bellDiameter;
    }

    public String play() {
        return "Romance for Horn...";
    }
}
