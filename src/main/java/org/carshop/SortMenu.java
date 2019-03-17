package org.carshop;

import java.util.Collections;
import java.util.List;

public class SortMenu {

    private SortMenu() {}

    public static List<Car> sortByOneElementAndReturn(List<Car> list, int choice){
        
        switch(choice){

            case 1 : Collections.sort(list, new CarComparator.SortByMake());
                break;
            case 2 : Collections.sort(list, new CarComparator.SortByPrice());
                break;
            case 3 : Collections.sort(list, new CarComparator.SortByYear());
                break;
            case 4 : Collections.sort(list, new CarComparator.SortByMileage());
                break;
            case 5 : Collections.sort(list, new CarComparator.SortByDoor());
                break;
            case 6 : Collections.sort(list, new CarComparator.SortByColor());
                break;
        }
        return list;
    }


}
