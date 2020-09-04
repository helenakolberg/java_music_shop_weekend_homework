import instruments.Violin;
import instruments.enums.Category;
import instruments.enums.StringType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(Category.STRING, "wood", "dark brown", 100.0, 199.99, StringType.STEEL);
    }

    @Test
    public void canGetCategory() {
        assertEquals(Category.STRING, violin.getCategory());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", violin.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("dark brown", violin.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(100.0, violin.getBuyingCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(199.99, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetStringType() {
        assertEquals(StringType.STEEL, violin.getStringType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(99.99, violin.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("The Bach Chaconne in D Minor...", violin.play());
    }
}
