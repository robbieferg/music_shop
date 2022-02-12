import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void before() {
        piano = new Piano(InstrumentType.STRINGS, InstrumentColour.BLACK, 88, 550.00, 775.00);
    }

    @Test
    public void hasAttributes() {
        assertEquals(InstrumentType.STRINGS, piano.getInstrumentType());
        assertEquals(InstrumentColour.BLACK, piano.getInstrumentColour());
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(550.00, piano.getBuyingPrice(), 0.0);
        assertEquals(775.00, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(225.00, piano.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("plink plink plink", piano.play());
    }
}
