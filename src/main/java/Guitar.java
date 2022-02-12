public class Guitar extends Instrument implements ISell, IPlay {
    private int numberOfStrings;
    private double buyingPrice;
    private double sellingPrice;

    public Guitar(InstrumentType instrumentType, InstrumentColour instrumentColour, int numberOfStrings, double buyingPrice, double sellingPrice) {
        super(instrumentType, instrumentColour);
        this.numberOfStrings = numberOfStrings;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
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
        return "strum strum strum";
    }
}
