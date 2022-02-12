import javax.sound.midi.Soundbank;

public class Trumpet extends Instrument implements ISell, IPlay {
    private int numberOfValves;
    private double buyingPrice;
    private double sellingPrice;

    public Trumpet(InstrumentType instrumentType, InstrumentColour instrumentColour, int numberOfValves, double buyingPrice, double sellingPrice) {
        super(instrumentType, instrumentColour);
        this.numberOfValves = numberOfValves;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
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
        return "trumpet noises";
    }
}
