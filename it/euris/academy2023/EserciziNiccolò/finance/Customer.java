package it.euris.academy2023.EserciziNiccolò.finance;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private int birthYear;
    private String id;
    private List<Account> accounts;

    public Customer(String name, String surname, int birthYear, String id, List<Account> accounts) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.id = id;
        this.accounts = accounts;
    }

    public Customer(String name, String surname, int birthYear, String id) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public Customer(){
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account ac){
        this.accounts.add(ac);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", id='" + id + '\'';
    }
}
