public class Piano extends Instrument implements ISell, IPlay {
    private int numberOfKeys;
    private double buyingPrice;
    private double sellingPrice;

    public Piano(InstrumentType instrumentType, InstrumentColour instrumentColour, int numberOfKeys, double buyingPrice, double sellingPrice) {
        super(instrumentType, instrumentColour);
        this.numberOfKeys = numberOfKeys;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

    public String play() {
        return "plink plink plink";
    }
}
