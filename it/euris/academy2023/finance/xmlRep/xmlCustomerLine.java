package it.euris.academy2023.finance.xmlRep;

import it.euris.academy2023.finance.Account;
import it.euris.academy2023.finance.Customer;

public class xmlCustomerLine {

    private Customer c;
    public xmlCustomerLine(Customer customer) {
        this.c = customer;
    }

    @Override
    public String toString() {
        String s = "<customer" +
                    " " + c.toString() +
                    ">";
        for (Account ac : c.getAccounts()) {
            s += "<accounts>";
            s += (new xmlAccountLine(ac)).toString();
            s += "</accounts>";
        }

        s += "</customer>";

        return s;
    }
}
