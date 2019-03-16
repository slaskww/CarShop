package org.carshop;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

        MyGarage garage = new MyGarage();
        MainMenu menu = new MainMenu();

        while (menu.getChoice() != 9) {
            CarUtil.showTitle();
            menu.executeMainMenu(garage);
        }

    }
}
