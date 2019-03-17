package org.carshop;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class CarFilter {

    private CarFilter() {}

    static List<Car> filterBy(List<Car> list, Predicate<Car> predicate){

    return  list
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}
