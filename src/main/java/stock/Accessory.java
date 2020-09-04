package stock;

public class Accessory {

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
}
