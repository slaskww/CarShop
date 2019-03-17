package org.carshop;

import java.math.BigDecimal;
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
                String makeToFilter = CarUtil.takeMakeToFilter(list);
                predicate = new CarFilterPredicate.FilterByMake(makeToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;

            case 2 :
                BigDecimal priceToFilter = CarUtil.takePriceToFilter(list);
                predicate = new CarFilterPredicate.FilterByPrice(priceToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;

            case 3 :
                Integer yearToFilter = CarUtil.takeYearToFilter(list);
                predicate = new CarFilterPredicate.FilterByYear(yearToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;

            case 4 :
                Integer mileageToFilter = CarUtil.takeMileageToFilter(list);
                predicate = new CarFilterPredicate.FilterByMileage(mileageToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;
            case 5 :
                Integer doorToFilter = CarUtil.takeDoorToFilter(list);
                predicate = new CarFilterPredicate.FilterByDoor(doorToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;
            case 6 :
                String colorToFilter = CarUtil.takeColorToFilter(list);
                predicate = new CarFilterPredicate.FilterByColor(colorToFilter);
                filteredList = CarFilter.filterBy(list, predicate);
                break;
        }
        return filteredList;
    }



}
