package org.carshop;

import java.math.BigDecimal;
import java.util.function.Predicate;

class CarFilterPredicate {

    public static class FilterByPrice implements Predicate<Car> {
        BigDecimal price;

        FilterByPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public boolean test(Car car) {
            return car.getPrice().compareTo(price) < 0;
        }
    }

    public static class FilterByMake implements Predicate<Car> {
        String make;

        FilterByMake(String make) {
            this.make = make;
        }

        @Override
        public boolean test(Car car) {
            return car.getMake().equals(make);
        }
    }

    public static class FilterByYear implements Predicate<Car> {
        Integer year;

        FilterByYear(Integer year) {
            this.year = year;
        }

        @Override
        public boolean test(Car car) {
            return car.getYear() == year;
        }
    }

    public static class FilterByMileage implements Predicate<Car> {
        Integer mileage;

        FilterByMileage(Integer mileage) {
            this.mileage = mileage;
        }

        @Override
        public boolean test(Car car) {
            return car.getMileage() <= mileage;
        }
    }

    public static class FilterByDoor implements Predicate<Car> {
        Integer door;

        FilterByDoor(Integer door) {
            this.door = door;
        }

        @Override
        public boolean test(Car car) {
            return car.getDoor() == door;
        }
    }

    public static class FilterByColor implements Predicate<Car> {
        String color;

        FilterByColor(String color) {
            this.color = color;
        }

        @Override
        public boolean test(Car car) {
            return car.getColor().equals(color);
        }
    }
}
