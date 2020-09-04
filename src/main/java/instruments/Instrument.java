package instruments;

public abstract class Instrument {

    public String category;
    public String material;
    public String colour;
    public double buyingCost;
    public double sellingPrice;

    public Instrument(String category, String material, String colour, double buyingCost, double sellingPrice) {
        this.category = category;
        this.material = material;
        this.colour = colour;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }
}
