package it.euris.academy2023.finance;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private List<Balance> balances;
    private accountType type;
    public enum accountType{
        DT,
        CC,
        DR
    }

    public Account(int id, List<Balance> balances, accountType type) {
        this.id = id;
        this.balances = balances;
        this.type = type;
    }

    public Account(int id, accountType type) {
        this.id = id;
        this.balances = new ArrayList<>();
        this.type = type;
    }

    public Account(){
        this.balances = new ArrayList<>();
    }

    public void addBalance(Balance b){
        this.balances.add(b);
    }

    public List<Balance> getBalances() {
        return balances;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", type=" + type;
    }
}
