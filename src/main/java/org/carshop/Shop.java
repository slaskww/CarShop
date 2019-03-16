package org.carshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

    MyGarage garage = new MyGarage();



        showTitle();
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




   public static void showListMenu(){
       System.out.println("Jak wyświetlić listę?");
       System.out.println("1 - posortuj i wyświetl");
       System.out.println("2 - przefiltruj i wyświetl");
       System.out.println();
   }

   public static void showSortMenu(){
       System.out.println("Jak posortoać listę?");
       System.out.println("1 -  wg. producenta");
       System.out.println("2 -  wg. ceny");
       System.out.println("3 -  wg. rocznika");
       System.out.println("4 -  wg. przebiegu");
       System.out.println("5 -  wg. liczby drzwi");
       System.out.println("6 -  wg. koloru");
       System.out.println();
   }

   public static void showFilterMenu(){
       System.out.println("Jak przefiltrować listę?");
       System.out.println("1 -  producent");
       System.out.println("2 -  cena");
       System.out.println("3 -  rocznik");
       System.out.println("4 -  przebieg");
       System.out.println("5 -  liczba drzwi");
       System.out.println("6 -  kolor");
       System.out.println();
   }

}
