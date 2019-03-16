package org.carshop;

import java.util.List;

public class FilterMenu {

    private FilterMenu() {
    }

    public static void filterByChosen(List<Car> list){

        int choice = CarUtil.showFilterMenu();

        switch(choice){

            case 1 : CarFilter.filterByMake(list);
                break;
            case 2 : CarFilter.filterByPrice(list);
                break;
            case 3 : CarFilter.filterByYear(list);
                break;
            case 4 : CarFilter.filterByMileage(list);
                break;
            case 5 : CarFilter.filterByDoor(list);
                break;
            case 6 : CarFilter.filterByColor(list);
                break;
        }

    }



}
