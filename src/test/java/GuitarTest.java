import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRINGS, InstrumentColour.BROWN, 6, 195.00, 325.50);
    }

    @Test
    public void hasAttributes() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
        assertEquals(InstrumentColour.BROWN, guitar.getInstrumentColour());
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(195.00, guitar.getBuyingPrice(), 0.0);
        assertEquals(325.50, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(130.50, guitar.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("strum strum strum", guitar.play());
    }
}


