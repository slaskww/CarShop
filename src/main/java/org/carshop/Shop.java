package org.carshop;


public class Shop {

    public static void main(String[] args) {

        MyGarage garage = new MyGarage();
        MainMenu menu = new MainMenu();

        CarUtil.showTitle();
        while (menu.getChoice() != 9) {
            menu.executeMainMenu(garage);
        }

    }
}
