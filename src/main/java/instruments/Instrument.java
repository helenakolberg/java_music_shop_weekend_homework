package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    public Category category;
    public String material;
    public String colour;
    public double buyingCost;
    public double sellingPrice;

    public Instrument(Category category, String material, String colour, double buyingCost, double sellingPrice) {
        this.category = category;
        this.material = material;
        this.colour = colour;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public Category getCategory() {
        return category;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingCost;
    };

    public abstract String play();
}
