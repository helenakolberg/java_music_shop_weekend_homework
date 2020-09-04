import instruments.Guitar;
import instruments.enums.Category;
import instruments.enums.StringType;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(Category.STRING, "wood", "light brown", 40.0, 99.99, Type.ACOUSTIC, StringType.NYLON, 6);
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
}
