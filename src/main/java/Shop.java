import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void add(ISell item) {
        stock.add(item);
    }

    public void remove(ISell item) {
        stock.remove(item);
    }
}
