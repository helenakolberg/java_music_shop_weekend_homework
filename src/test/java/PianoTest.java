import instruments.enums.Category;
import instruments.Piano;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(Category.KEYBOARD, "wood", "black", 400.0, 799.99, Type.ACOUSTIC, 76);
    }

    @Test
    public void canGetCategory() {
        assertEquals(Category.KEYBOARD, piano.getCategory());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(400.0, piano.getBuyingCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(799.99, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(Type.ACOUSTIC, piano.getType());
    }

    @Test
    public void canGetNumOfKeys() {
        assertEquals(76, piano.getNumOfKeys());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(399.99, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Für Elise...", piano.play());
    }

}
