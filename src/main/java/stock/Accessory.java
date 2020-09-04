package stock;

import behaviours.ISell;

public class Accessory implements ISell {

    private String description;
    private double buyingCost;
    private double sellingPrice;

    public Accessory(String description, double buyingCost, double sellingPrice) {
        this.description = description;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
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
}
