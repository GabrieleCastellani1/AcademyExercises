package it.euris.academy2023.EserciziNiccolò.finance;

public class Main {
    public static void main(String[] args) {
        FinancialInstrument f1 = new FinancialInstrument();
        FinancialInstrument f2 = new FinancialInstrument();
        Balance b1 = new Balance(10.5, f1);
        Balance b2 = new Balance(18.5, f2);
        Account a1 = new Account();
        a1.getBalances().add(b1);
        a1.getBalances().add(b1);
        Customer c1 = new Customer("mario", "rossi", 1989, "codiceFiscalediMarioRossi");
        c1.getAccounts().add(a1);

        PortfolioSimulator ps = new PortfolioSimulator();
        ps.addCustomer(c1);
        System.out.println(ps.printXml());
    }
}
