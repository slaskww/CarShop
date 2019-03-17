package org.carshop;

import java.util.Comparator;

 class CarComparator {

    public static class SortByMake implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return o1.getMake().compareTo(o2.getMake());
        }
    }

    public static class SortByPrice implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return o1.getPrice().compareTo(o2.getPrice());
        }
    }

    public static class SortByYear implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return Integer.compare(o1.getYear(), o2.getYear());
        }
    }

    public static class SortByMileage implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return Integer.compare(o1.getMileage(), o2.getMileage());
        }
    }

    public static class SortByDoor implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return Integer.compare(o1.getDoor(), o2.getDoor());
        }
    }

    public static class SortByColor implements Comparator<Car> {
        public int compare(Car o1, Car o2) {

            return o1.getColor().compareTo(o2.getColor());
        }
    }

}
