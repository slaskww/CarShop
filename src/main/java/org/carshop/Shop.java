package org.carshop;


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
