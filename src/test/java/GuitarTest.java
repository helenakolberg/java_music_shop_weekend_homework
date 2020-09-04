import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("string", "wood", "light brown", 40, 99.99, "acoustic", "nylon", 6);
    }

    @Test
    public void canGetCategory() {
        assertEquals("string", guitar.getCategory());
    }
}
