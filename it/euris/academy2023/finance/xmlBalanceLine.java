package it.euris.academy2023.finance;

public class xmlBalanceLine {
    private Balance b;
    public xmlBalanceLine(Balance b) {
        this.b = b;
    }

    @Override
    public String toString() {
        String s = "<balance "
                    + b.toString()
                    + ">";
        s += "<FinancialInstrument>";
        s += b.getInstrument().toString();
        s += "</FinancialInstrument";
        return s;
    }
}
