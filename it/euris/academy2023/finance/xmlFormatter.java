package it.euris.academy2023.finance;

import java.util.List;

public class xmlFormatter {
    public String render(List<Customer> customers) {
        String s = "";
        for (Customer customer : customers) {
            s += (new xmlCustomerLine(customer)).toString();
            s += "\n";
        }
        return s;
    }
}
