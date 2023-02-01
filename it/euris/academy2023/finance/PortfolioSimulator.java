package it.euris.academy2023.finance;

import it.euris.academy2023.finance.xmlRep.xmlFormatter;

import java.util.ArrayList;
import java.util.List;

public class PortfolioSimulator {

    private List<Customer> customers;

    public PortfolioSimulator(){
        this.customers = new ArrayList<>();
    }

    public PortfolioSimulator(List<Customer> customers){
        this.customers = customers;
    }

    public void addCustomer(Customer c){
        this.customers.add(c);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String printXml(){
        xmlFormatter formatter = new xmlFormatter();
        return formatter.render(customers);
    }
}
