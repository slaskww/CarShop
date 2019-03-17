package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarProfit {
    private static BigDecimal balance = new BigDecimal(0);
    private static List<AccountHistoryObject> accountHistory =  new ArrayList<>();


    public CarProfit() {
    }

    public static String getBalance() {
         return "Stan konta: " + balance + " PLN\n";
    }

    public static void editBalance(BigDecimal transfer) {
        balance = balance.add(transfer);
        accountHistory.add(new AccountHistoryObject(transfer));
    }

    public static List<AccountHistoryObject> getAccountHistory() {
        return accountHistory;
    }

}

