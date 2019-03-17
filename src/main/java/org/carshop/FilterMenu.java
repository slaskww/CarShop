package org.carshop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMenu {

    private FilterMenu() {
    }

    public static List<Car> filterByChosen(List<Car> list, int choice){

        List<Car> filteredList = new ArrayList<>();
        Predicate<Car> predicate;

        switch(choice){

            case 1 :
                 predicate = CarFilterPredicate.FilterByMake.
                filteredList = CarFilter.filterBy(list, );
                break;
            case 2 : filteredList = CarFilter.filterBy(list);
                break;
            case 3 : filteredList = CarFilter.filterBy(list);
                break;
            case 4 : filteredList = CarFilter.filterBy(list);
                break;
            case 5 : filteredList = CarFilter.filterBy(list);
                break;
            case 6 : filteredList = CarFilter.filterBy(list);
                break;
        }
        return filteredList;
    }



}
