package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


public class CarFilter {

    public CarFilter() {}

    public static List<Car> filterByMake(List<Car> list){
       String makeToFilter = CarUtil.takeMakeToFilter(list);

        return  list
                .stream()
                .filter(car -> car.getMake().equals(makeToFilter))
                .collect(Collectors.toList());
    }

    public static List<Car> filterByPrice(List<Car> list){
        BigDecimal priceToFilter = CarUtil.takePriceToFilter(list);

        return list
                .stream()
                .filter(car -> car.getPrice().compareTo(priceToFilter) < 0)
                .collect(Collectors.toList());
    }

    public static List<Car> filterByYear(List<Car> list){
        Integer yearToFilter = CarUtil.takeYearToFilter(list);

        return list
                .stream()
                .filter(car -> car.getYear() == yearToFilter)
                .collect(Collectors.toList());
    }

    public static List<Car> filterByMileage(List<Car> list){
        Integer mileageToFilter = CarUtil.takeMileageToFilter(list);

        return list
                .stream()
                .filter(car -> car.getMilage() < mileageToFilter)
                .collect(Collectors.toList());
    }

    public static List<Car> filterByDoor(List<Car> list){
        Integer doorToFilter = CarUtil.takeDoorToFilter(list);

       return list
                .stream()
                .filter(car -> car.getDoor() == doorToFilter)
                .collect(Collectors.toList());
    }

    public static List<Car> filterByColor(List<Car> list){
        String colorToFilter = CarUtil.takeColorToFilter(list);

       return list
                .stream()
                .filter(car -> car.getColor().equals(colorToFilter))
                .collect(Collectors.toList());
    }
}
