package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class CarFilterPredicate {

    public static class FilterByPrice implements Predicate<Car>{

        BigDecimal price;

        public FilterByPrice(BigDecimal price) {
            this.price = price;
        }
        @Override
        public boolean test(Car car) {
            return car.getPrice().equals(price);
        }
    }

    public static class FilterByMake implements Predicate<Car>{

        String make;
        public FilterByMake(String make) {
            this.make = make;
        }
        @Override
        public boolean test(Car car) {
            return car.getMake().equals(make);
        }
    }

    public static class FilterByYear implements Predicate<Car>{
        Integer year;

        public FilterByYear(Integer year) {
            this.year = year;
        }

        @Override
        public boolean test(Car car) {
            return car.getYear() == year;
        }
    }

    public static class FilterByMileage implements Predicate<Car>{
        Integer mileage;

        public FilterByMileage(Integer mileage) {
            this.mileage  =  mileage;

        }

        @Override
        public boolean test(Car car) {
            return car.getMilage() == mileage;
        }
    }

    public static class FilterByDoor implements Predicate<Car>{
        Integer door;

        public FilterByDoor(Integer door) {
            this.door = door;
        }

        @Override
        public boolean test(Car car) {
            return car.getDoor()  ==  door;
        }
    }

    public static class FilterByColor implements Predicate<Car>{
        String color;

        public FilterByColor(String color) {
            this.color = color;
        }

        @Override
        public boolean test(Car car) {
            return car.getColor().equals(color);
        }
    }
}
