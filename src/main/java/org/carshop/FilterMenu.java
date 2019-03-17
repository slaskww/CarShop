package org.carshop;

import java.util.ArrayList;
import java.util.List;

public class FilterMenu {

    private FilterMenu() {
    }

    public static List<Car> filterByChosen(List<Car> list, int choice){

        List<Car> filteredList = new ArrayList<>();

        switch(choice){

            case 1 : filteredList = CarFilter.filterByMake(list);
                break;
            case 2 : filteredList = CarFilter.filterByPrice(list);
                break;
            case 3 : filteredList = CarFilter.filterByYear(list);
                break;
            case 4 : filteredList = CarFilter.filterByMileage(list);
                break;
            case 5 : filteredList = CarFilter.filterByDoor(list);
                break;
            case 6 : filteredList = CarFilter.filterByColor(list);
                break;
        }
        return filteredList;
    }



}
