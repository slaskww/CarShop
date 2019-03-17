package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

class FilterMenu {

    private FilterMenu() {}

    static List<Car> filterByChosen(List<Car> list, int choice) {

        List<Car> filteredList;
        Predicate<Car> predicate = null;

        switch (choice) {

            case 1:
                String makeToFilter = CarUtil.takeMakeToFilter(list);
                predicate = new CarFilterPredicate.FilterByMake(makeToFilter);
                break;

            case 2:
                BigDecimal priceToFilter = CarUtil.takePriceToFilter();
                predicate = new CarFilterPredicate.FilterByPrice(priceToFilter);
                break;

            case 3:
                Integer yearToFilter = CarUtil.takeYearToFilter(list);
                predicate = new CarFilterPredicate.FilterByYear(yearToFilter);
                break;

            case 4:
                Integer mileageToFilter = CarUtil.takeMileageToFilter();
                predicate = new CarFilterPredicate.FilterByMileage(mileageToFilter);
                break;
            case 5:
                Integer doorToFilter = CarUtil.takeDoorToFilter(list);
                predicate = new CarFilterPredicate.FilterByDoor(doorToFilter);
                break;
            case 6:
                String colorToFilter = CarUtil.takeColorToFilter(list);
                predicate = new CarFilterPredicate.FilterByColor(colorToFilter);
                break;

            default:
                System.out.println("Brak kryterium o takim numerze.");
        }

        if (predicate == null) {
            return list;
        }

        filteredList = CarFilter.filterBy(list, predicate);
        return filteredList;
    }


}
