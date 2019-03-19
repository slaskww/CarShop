package org.carshop;

import java.util.List;

class SortMenu {

    private SortMenu() {}

    static List<Car> sortByOneElementAndReturn(List<Car> list, String choice){
        
        switch(choice){

            case "1" : list.sort(new CarComparator.SortByMake());
                break;
            case "2" : list.sort(new CarComparator.SortByPrice());
                break;
            case "3" : list.sort(new CarComparator.SortByYear());
                break;
            case "4" : list.sort(new CarComparator.SortByMileage());
                break;
            case "5" : list.sort(new CarComparator.SortByDoor());
                break;
            case "6" : list.sort(new CarComparator.SortByColor());
                break;
            default:
                CarUtil.defaultMessage();

        }
        return list;
    }


}
