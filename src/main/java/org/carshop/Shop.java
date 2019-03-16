package org.carshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

    MyGarage garage = new MyGarage();
    MainMenu menu = new MainMenu();

    while(menu.getChoice() != 4){
        showTitle();
        menu.showMainMenu();
        menu.executeMainMenu(garage);
    }


      //  showMainMenu();
       // showListMenu();
       // showSortMenu();
       // showFilterMenu();
    }

   public static void showTitle(){
       System.out.println("=======================");
       System.out.println(" Car-Shop PHU Lukaszex  ");
       System.out.println("I bedzie Pan zadowolony!");
       System.out.println("=======================");
   }


}
