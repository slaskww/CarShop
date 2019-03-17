package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

 class CarProfit {

    private static BigDecimal balance = new BigDecimal(0);
    private static List<AccountHistoryObject> accountHistory =  new ArrayList<>();

    private CarProfit() {
    }

    static String getBalance() {
         return "Balance: " + balance + " USD\n";
    }

    static void editBalance(BigDecimal transfer) {
        balance = balance.add(transfer);
        accountHistory.add(new AccountHistoryObject(transfer));
    }

    static List<AccountHistoryObject> getAccountHistory() {
        return accountHistory;
    }

}

