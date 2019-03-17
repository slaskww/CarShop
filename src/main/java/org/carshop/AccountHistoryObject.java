package org.carshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountHistoryObject {

  private LocalDateTime todayDate;
  private BigDecimal singleTransfer = new BigDecimal(0);

     AccountHistoryObject(BigDecimal singleTransfer) {
        this.todayDate = LocalDateTime.now();
        this.singleTransfer = this.singleTransfer.add(singleTransfer);
    }


    @Override
    public String toString() {
        String formattedDate = CarUtil.formatDate(todayDate);
        return formattedDate + " " + singleTransfer;

    }
}
