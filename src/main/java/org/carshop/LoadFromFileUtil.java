package org.carshop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;

 public class LoadFromFileUtil {

 public static void loadFromFile(MyGarage garage) {

        if (CarUtil.isLoadingFromFileChosen()) {
            try {
                FileInputStream fInput = new FileInputStream(new File("SavedData.txt"));
                ObjectInputStream objInput = new ObjectInputStream(fInput);

                garage.addCarList((ArrayList<Car>) objInput.readObject());
                CarProfit.loadAccountHistory((ArrayList<AccountHistoryObject>) objInput.readObject());
                CarProfit.loadBalance((BigDecimal) objInput.readObject());

                fInput.close();
                objInput.close();
                CarUtil.messageAfterLoading();

            } catch (IOException | ClassNotFoundException e) {
                CarUtil.messageFileNotFound();
            }
        }
    }
}
