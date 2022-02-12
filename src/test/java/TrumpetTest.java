import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(InstrumentType.BRASS, InstrumentColour.GOLD, 4, 280.30, 505.00);
    }

    @Test
    public void hasAttributes() {
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
        assertEquals(InstrumentColour.GOLD, trumpet.getInstrumentColour());
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(280.30, trumpet.getBuyingPrice(), 0.0);
        assertEquals(505.00, trumpet.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(224.70, trumpet.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet noises", trumpet.play());
    }
}
