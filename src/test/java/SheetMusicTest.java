import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(5.15, 9.99);
    }

    @Test
    public void hasBuyingAndSellingPrice() {
        assertEquals(5.15, sheetMusic.getBuyingPrice(), 0.0);
        assertEquals(9.99, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.84, sheetMusic.calculateMarkup(), 0.0);
    }
}
