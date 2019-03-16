package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


public class CarFilter {

    public CarFilter() {}

    public static void filterByMake(List<Car> list){
       String makeToFilter = CarUtil.takeMakeToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getMake() == makeToFilter)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }

    public static void filterByPrice(List<Car> list){
        BigDecimal priceToFilter = CarUtil.takePriceToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getPrice().compareTo(priceToFilter) < 0)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }
    public static void filterByYear(List<Car> list){
        Integer yearToFilter = CarUtil.takeYearToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getYear() == yearToFilter)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }
    public static void filterByMileage(List<Car> list){
        Integer mileageToFilter = CarUtil.takeMileageToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getMilage() == mileageToFilter)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }
    public static void filterByDoor(List<Car> list){
        Integer doorToFilter = CarUtil.takeDoorToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getDoor() == doorToFilter)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }
    public static void filterByColor(List<Car> list){
        String colorToFilter = CarUtil.takeColorToFilter(list);

        List<Car> filteredList = list
                .stream()
                .filter(car -> car.getColor() == colorToFilter)
                .collect(Collectors.toList());

        CarUtil.showList(filteredList);
    }
}
