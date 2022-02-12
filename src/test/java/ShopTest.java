import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Guitar guitar;
    private Trumpet trumpet;
    private SheetMusic sheetMusic;
    private GuitarString guitarString;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(InstrumentType.STRINGS, InstrumentColour.PURPLE, 6, 65.00, 112.45);
        trumpet = new Trumpet(InstrumentType.BRASS, InstrumentColour.SILVER, 4, 78.90, 156.00);
        sheetMusic = new SheetMusic(5.00, 10.00);
        guitarString = new GuitarString(14.00, 25.00);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItem() {
        shop.add(guitar);
        assertEquals(1, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(guitar));
    }

    @Test
    public void canAddItemsOfDifferentClass() {
        shop.add(trumpet);
        shop.add(sheetMusic);
        assertEquals(2, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(trumpet));
        assertEquals(true, shop.getStock().contains(sheetMusic));
    }

    @Test
    public void canRemoveItem() {
        shop.add(guitar);
        shop.add(guitarString);
        shop.remove(guitar);
        assertEquals(1, shop.getStock().size());
        assertEquals(true, shop.getStock().contains(guitarString));
        assertEquals(false, shop.getStock().contains(guitar));
    }
}


