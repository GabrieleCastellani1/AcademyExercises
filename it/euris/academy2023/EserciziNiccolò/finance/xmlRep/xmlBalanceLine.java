package it.euris.academy2023.EserciziNiccolò.finance.xmlRep;

import it.euris.academy2023.EserciziNiccolò.finance.Balance;

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
