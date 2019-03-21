package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

 class CarProfit {

    public static  final BigDecimal ROI = BigDecimal.valueOf(1.2); //Return on Investment
    private static BigDecimal balance = new BigDecimal(0);
    private static List<AccountHistoryObject> accountHistory =  new ArrayList<>();

    private CarProfit() {
    }

    static void editBalance(BigDecimal transfer) {
        balance = balance.add(transfer);
        accountHistory.add(new AccountHistoryObject(transfer));
    }

    static List<AccountHistoryObject> getAccountHistory() {
        return accountHistory;
    }

    static BigDecimal getBalance() {
         return balance;
     }


     static void loadAccountHistory(List<AccountHistoryObject> history){
        accountHistory.addAll(history);
     }

     static void loadBalance(BigDecimal b){
         balance = balance.add(b);
     }
}

