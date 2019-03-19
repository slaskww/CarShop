package org.carshop;


public class Shop {

    public static void main(String[] args) {

        CarUtil.changeLanguage();
        MyGarage garage = new MyGarage();
        MainMenu menu = new MainMenu();

        CarUtil.showTitle();
        while (!menu.getChoice().equals("9")) {
            menu.executeMainMenu(garage);
        }

    }
}
