import behaviours.ISell;
import instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }


    public int stockCount() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public ISell removeItem(ISell item) {
        int index = this.stock.indexOf(item);
        return this.stock.remove(index);
    }
}
