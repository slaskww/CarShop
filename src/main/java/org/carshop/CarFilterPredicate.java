package org.carshop;

import java.util.List;
import java.util.function.Predicate;

public class CarFilterPredicate {

    public static class FilterByPrice implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return car.getPrice().equals()
        }
    }

    public static class FilterByMake implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return false;
        }
    }

    public static class FilterByYear implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return false;
        }
    }

    public static class FilterByMileage implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return false;
        }
    }

    public static class FilterByDoor implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return false;
        }
    }

    public static class FilterByColor implements Predicate<Car>{
        @Override
        public boolean test(Car car) {
            return false;
        }
    }
}
