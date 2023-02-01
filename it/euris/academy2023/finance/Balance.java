package it.euris.academy2023.finance;

public class Balance {
    private FinancialInstrument instrument;
    private double quotes;
    public Balance(double quote, FinancialInstrument instrument){
        this.instrument = instrument;
        this.quotes = quote;
    }

    public Balance(){}

    public FinancialInstrument getInstrument() {
        return instrument;
    }
}
