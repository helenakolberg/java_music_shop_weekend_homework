import instruments.FrenchHorn;
import instruments.Guitar;
import instruments.Piano;
import instruments.Violin;
import instruments.enums.Category;
import instruments.enums.StringType;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;
import stock.Accessory;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Violin violin;
    FrenchHorn frenchHorn;
    Accessory accessory;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(Category.STRING, "wood", "light brown", 40.0, 99.99, Type.ACOUSTIC, StringType.NYLON, 6);
        piano = new Piano(Category.KEYBOARD, "wood", "black", 400.0, 799.99, Type.ACOUSTIC, 76);
        violin = new Violin(Category.STRING, "wood", "dark brown", 100.0, 199.99, StringType.STEEL);
        frenchHorn = new FrenchHorn(Category.BRASS, "nickel-silver", "silver", 200.0, 499.99, 29.0);
        accessory = new Accessory("guitar case", 10.0, 20.0);
    }

    @Test
    public void canCheckStockCount() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItem() {
        shop.addItem(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.addItem(violin);
        shop.addItem(frenchHorn);
        shop.addItem(accessory);
        assertEquals(869.96, shop.calculateProfit(), 0.01);
    }
}
