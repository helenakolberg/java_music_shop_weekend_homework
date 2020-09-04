import instruments.FrenchHorn;
import instruments.enums.Category;
import instruments.enums.StringType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {

    FrenchHorn frenchHorn;

    @Before
    public void before() {
        frenchHorn = new FrenchHorn(Category.BRASS, "nickel-silver", "silver", 200.0, 499.99, 29.0);
    }

    @Test
    public void canGetCategory() {
        assertEquals(Category.BRASS, frenchHorn.getCategory());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("nickel-silver", frenchHorn.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("silver", frenchHorn.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(200.0, frenchHorn.getBuyingCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(499.99, frenchHorn.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetBellDiameter() {
        assertEquals(29.0, frenchHorn.getBellDiameter(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(299.99, frenchHorn.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Romance for Horn...", frenchHorn.play());
    }
}
