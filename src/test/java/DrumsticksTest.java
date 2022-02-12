import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    private Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks(15.50, 24.50);
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(15.50, drumsticks.getBuyingPrice(), 0.0);
        assertEquals(24.50, drumsticks.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(9.00, drumsticks.calculateMarkup(), 0.0);
    }
}
