import org.junit.Before;
import org.junit.Test;
import stock.Accessory;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory("guitar case", 10.0, 20.0);
    }

    @Test
    public void canGetDescription() {
        assertEquals("guitar case", accessory.getDescription());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(10.0, accessory.getBuyingCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(20.0, accessory.getSellingPrice(), 0.01);
    }
}
