package org.carshop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMenu {

    private Integer choice  = 0;

    private SortMenu() {}

    public void sortByChosen(List<Car> list){

        choice =  CarUtil.showSortMenu();

        switch(choice){

            case 1 : Collections.sort(list, Car::getMake);
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
        }

//        System.out.println("Posortuj listę po:");
//        System.out.println("1 - marce pojazdu");
//        System.out.println("2 - cenie pojazdu");
//        System.out.println("3 - roku produkcji");
//        System.out.println("4 - przebiegu");
//        System.out.println("5 - liczbie drzwi");
//        System.out.println("6 - kolorze karoserii");

    }

}
