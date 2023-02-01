package it.euris.academy2023.finance.xmlRep;

import it.euris.academy2023.finance.Customer;

import java.util.List;

public class xmlFormatter {
    public String render(List<Customer> customers) {
        String s = "<customers>\n";
        for (Customer customer : customers) {
            s += (new xmlCustomerLine(customer)).toString();
            s += "\n";
        }
        s += "</customers>";
        return s;
    }
}
