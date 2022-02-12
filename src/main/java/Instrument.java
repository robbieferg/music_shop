public abstract class Instrument {
    private InstrumentType instrumentType;
    private InstrumentColour instrumentColour;

    public Instrument(InstrumentType instrumentType, InstrumentColour instrumentColour) {
        this.instrumentType = instrumentType;
        this.instrumentColour = instrumentColour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public InstrumentColour getInstrumentColour() {
        return instrumentColour;
    }

    public void setInstrumentColour(InstrumentColour instrumentCoulour) {
        this.instrumentColour = instrumentCoulour;
    }
}
