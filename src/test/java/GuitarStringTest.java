import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    private GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString(19.25, 30.75);
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(19.25, guitarString.getBuyingPrice(), 0.0);
        assertEquals(30.75, guitarString.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(11.50, guitarString.calculateMarkup(), 0.0);
    }
}
