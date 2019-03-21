package org.carshop;


public class Shop {

    public static void main(String[] args) {

        MyGarage garage = new MyGarage();
        MainMenu menu = new MainMenu();

        CarUtil.showTitle();
        CarUtil.changeLanguage();
        menu.loadFromFile(garage);
        while (!menu.getChoice().equals("9")) {
            menu.executeMainMenu(garage);
        }

    }
}
