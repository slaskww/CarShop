package org.carshop;

import java.util.Comparator;

public class CarComparator  {

public static class SortByMake implements Comparator<Car>{

    public int compare(Car o1, Car o2) {
        return o1.getMake().compareTo(o2.getMake());
    }
}

    public static class SortByPrice implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return o1.getPrice().compareTo(o2.getPrice());
        }
    }

    public static class SortByYear implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return new Integer(o1.getYear()).compareTo(o2.getYear());
        }
    }

    public static class SortByMileage implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return new Integer(o1.getMilage()).compareTo(o2.getMilage());
        }
    }

    public static class SortByDoor implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return new Integer(o1.getDoor()).compareTo(o2.getDoor());
        }
    }

    public static class SortByColor implements Comparator<Car>{

        public int compare(Car o1, Car o2) {
            return o1.getColor().compareTo(o2.getColor());
        }
    }

}
