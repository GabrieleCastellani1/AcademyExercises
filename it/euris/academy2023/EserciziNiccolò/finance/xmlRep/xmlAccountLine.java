package it.euris.academy2023.EserciziNiccolò.finance.xmlRep;

import it.euris.academy2023.EserciziNiccolò.finance.Account;
import it.euris.academy2023.EserciziNiccolò.finance.Balance;

public class xmlAccountLine {
    private Account ac;
    public xmlAccountLine(Account ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        String s = "<account" +
                    ac.toString() +
                    ">";
        for (Balance b : ac.getBalances()) {
            s += "<balances>";
            s += (new xmlBalanceLine(b));
            s += "</balances>";
        }

        s += "</account>";
        return s;
    }
}
