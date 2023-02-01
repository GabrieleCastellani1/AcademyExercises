package it.euris.academy2023.finance;

public class FinancialInstrument {
    private int id;
    private String description;
    private float lastPrice;
    private String country;
    private String currency;
    private financialType t;

    public enum financialType{
        EQY,
        FND,
        BND,
        CC,
        POL
    }

    public FinancialInstrument(int id, String description, float lastPrice, String country, String currency, financialType t) {
        this.id = id;
        this.description = description;
        this.lastPrice = lastPrice;
        this.country = country;
        this.currency = currency;
        this.t = t;
    }

    public FinancialInstrument(){}

    @Override
    public String toString() {
        return "id=" + id +
                ", description='" + description + '\'' +
                ", lastPrice=" + lastPrice +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", t=" + t;
    }
}
