import instruments.enums.Category;
import instruments.Guitar;
import instruments.enums.StringType;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(Category.STRING, "wood", "light brown", 40.0, 99.99, Type.ACOUSTIC, StringType.NYLON, 6);
    }

    @Test
    public void canGetCategory() {
        assertEquals(Category.STRING, guitar.getCategory());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("light brown", guitar.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(40.0, guitar.getBuyingCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(99.99, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(Type.ACOUSTIC, guitar.getType());
    }

    @Test
    public void canGetStringType() {
        assertEquals(StringType.NYLON, guitar.getStringType());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(59.99, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Wonderwall...", guitar.play());
    }
}
