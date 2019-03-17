package org.carshop;

import sun.reflect.generics.tree.Tree;

import java.math.BigDecimal;
import java.util.TreeMap;

public class CarProfit {
    BigDecimal balance;
    TreeMap<String,BigDecimal> accountHistory;


    public CarProfit(BigDecimal balance) {
        this.balance = new BigDecimal(0);
        accountHistory.put(CarUtil.getDate() ,new BigDecimal(0));
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addProfit(BigDecimal profit) {
        this.balance = balance.add(profit);
    }

    @Override
    public String toString() {
        return "Stan konta: " + balance + " PLN";
    }

    public void getAccountHistory(){
        CarUtil.showAccountHistory(accountHistory);
    }

}

