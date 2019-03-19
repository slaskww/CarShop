package org.carshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class CarUtil {

    static final String CHOICE_OUT_OF_RANGE = "OOF";
    static final String NO_ELEMENTS_TO_CHOOSE = "NETC";
    private static final Integer ZERO =  0;
    private static final Locale USA = new Locale("en", "US");
    private static final Locale POLAND = new Locale("pl", "PL");
    private static final Locale SWAHILI = new Locale("sua", "SUA");
    private static final int EMPTY_LIST = 0;

    private static Locale currentLocale = null;
    private static ResourceBundle message;
    private static Scanner input = new Scanner(System.in);

    private CarUtil() {
    }


    static void changeLanguage() {
        if (currentLocale == null) {
            message = ResourceBundle.getBundle("Bundle", POLAND);
        }

        System.out.println(
                message.getString("changeLanguageMsg1") + '\n' +
                        message.getString("changeLanguageOptPl") + '\n' +
                        message.getString("changeLanguageOptEn"));

        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println(message.getString("changeLanguageError"));
        }

        int c = input.nextInt();
        if (c == 1) {
            currentLocale = POLAND;
        } else if (c == 2) {
            currentLocale = USA;
        } else {
            System.out.println(message.getString("changeLanguageError2") + '\n');
            currentLocale = SWAHILI;
        }
        message = ResourceBundle.getBundle("Bundle", currentLocale);
    }

    static void defaultMessage() {
        System.out.println(message.getString("defaultMessage"));
    }

    static void showList(List<Car> list) {

        if (list.size() == EMPTY_LIST) {
            System.out.println(message.getString("showListCommunicate") + '\n');
            return;
        }
        System.out.println("--------------------------------------------------"
                + "--------------------------------------------------");

        System.out.printf("Id.  %-15s %-15s %-15s %-15s %-15s %-15s\n",
                Car.carFeatures.MAKE,
                Car.carFeatures.PRICE,
                Car.carFeatures.YEAR,
                Car.carFeatures.MILEAGE,
                Car.carFeatures.DOOR,
                Car.carFeatures.COLOR);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i).toString());
        }
        System.out.println();
    }

    static Car newCar() {

        String make;
        String color;
        BigDecimal price;
        int door;
        int year;
        int mileage;
        try {
            input.nextLine();
            System.out.println(message.getString("make"));
            make = input.nextLine();
            System.out.println(message.getString("price"));
            price = input.nextBigDecimal();
            System.out.println(message.getString("year"));
            year = input.nextInt();
            System.out.println(message.getString("mileage"));
            mileage = input.nextInt();
            System.out.println(message.getString("door"));
            door = input.nextInt();
            System.out.println(message.getString("color"));
            color = input.next();

            return new Car(color, make, price, door, year, mileage);

        } catch (InputMismatchException e) {
            System.out.println(message.getString("newCarError") + '\n');
            input.nextLine();
            return null;
        }
    }

    static Car removeCarMenu(List<Car> list) {

        if (list.size() == EMPTY_LIST) {
            System.out.println(message.getString("showListCommunicate") + '\n');
            return null;
        }

        System.out.println(message.getString("removeCarMenuMsg1"));
        showList(list);

        try {
            int toRemove = input.nextInt();
            while (toRemove == ZERO || toRemove > list.size()) {
                System.out.println(message.getString("removeCarMenuMsg2"));
                toRemove = input.nextInt();
            }
            System.out.println(
                    message.getString("removeCarMenuMsg3") + " " +
                            list.get(toRemove - 1).getMake() + " " +
                            message.getString("removeCarMenuMsg4") + '\n');
            return list.get(toRemove - 1);

        } catch (InputMismatchException e) {
            input.next();
            System.out.println(message.getString("removeCarMenuMsg5") + '\n');
            return null;
        }
    }

    static String showMainMenu() {

        System.out.println(message.getString("showMainMenuMsg1"));
        System.out.println(message.getString("showMainMenuMsg2"));
        System.out.println(message.getString("showMainMenuMsg3"));
        System.out.println(message.getString("showMainMenuMsg4"));
        System.out.println(message.getString("showMainMenuMsg5"));
        System.out.println(message.getString("showMainMenuMsg6"));
        System.out.println(message.getString("showMainMenuMsg7"));
        System.out.println(message.getString("showMainMenuMsg8"));
        System.out.println(message.getString("showMainMenuMsg9"));

        return input.next();
    }

    static void showBalance(BigDecimal balance) {

        System.out.print(
                message.getString("showBalanceMsg") + " ");
        System.out.printf("%.2f %s", balance, " PLN\n");
    }

    static void showTitle() {
        System.out.println("=========================");
        System.out.println("|  CAR DEALER MANAGER   |");
        System.out.println("=========================");
    }


    static String showSortMenuAndReturnChoiceNumber(List<Car> list) {

        if (list.size() == EMPTY_LIST) {
            System.out.println(message.getString("showListCommunicate") + '\n');
            return NO_ELEMENTS_TO_CHOOSE;
        }

        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg1"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg2"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg3"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg4"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg5"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg6"));
        System.out.println(message.getString("showSortMenuAndReturnChoiceNumberMsg7"));

        return input.next();
    }

    static String showFilterMenuAndReturnChoice(List<Car> list) {

        if (list.size() == EMPTY_LIST) {
            System.out.println(message.getString("showListCommunicate") + '\n');
            return NO_ELEMENTS_TO_CHOOSE;
        }

        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg1"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg2"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg3"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg4"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg5"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg6"));
        System.out.println(message.getString("showFilterMenuAndReturnChoiceMsg7"));

        return input.next();
    }

    static String takeMakeToFilter(List<Car> list) {

        Set<String> makes = new TreeSet<>();
        for (Car car : list) {
            makes.add(car.getMake());
        }

        System.out.println(message.getString("takeMakeToFilterMsg"));
        for (String s : makes) {
            System.out.println(s);
        }
        input.nextLine();
        return input.nextLine();
    }

    static int takeDoorToFilter(List<Car> list) {

        Set<Integer> doors = new TreeSet<>();
        for (Car car : list) {
            doors.add(car.getDoor());
        }

        System.out.println(message.getString("takeDoorToFilterMsg"));
        for (Integer s : doors) {
            System.out.println(s);
        }
        Integer doorsToFilter;
        while (true) {
            while (!input.hasNextInt()) {
                input.next();
                System.out.println(message.getString("defaultMessage2"));
            }
            doorsToFilter = input.nextInt();

            if(doorsToFilter.compareTo(ZERO) > ZERO) {
                return doorsToFilter;
            }
            System.out.println(message.getString("takePriceToFilterMsg2"));
        }
    }
    static String takeColorToFilter(List<Car> list) {

        Set<String> colors = new TreeSet<>();
        for (Car car : list) {
            colors.add(car.getColor());
        }

        System.out.println(message.getString("takeColorToFilterMsg"));
        for (String s : colors) {
            System.out.println(s);
        }
        input.nextLine();
        return input.nextLine();
    }

    static BigDecimal takePriceToFilter() {
        System.out.println(message.getString("takePriceToFilterMsg1"));

        BigDecimal maxPrice;
        while (true) {
            while (!input.hasNextBigDecimal()) {
                input.next();
                System.out.println(message.getString("showFilterError"));
            }
            maxPrice = input.nextBigDecimal();
            if (maxPrice.compareTo(BigDecimal.ZERO) >= ZERO) {
                return maxPrice;
            }

            System.out.println(message.getString("takePriceToFilterMsg2"));
        }
    }

    static Integer takeYearToFilter(List<Car> list) {

        Set<Integer> years = new TreeSet<>();
        for (Car car : list) {
            years.add(car.getYear());
        }

        System.out.println(message.getString("takeYearToFilterMsg"));
        for (Integer s : years) {
            System.out.println(s);
        }

        Integer year;
        while (true) {

            while (!input.hasNextInt()) {
                input.next();
                System.out.println(message.getString("defaultMessage2"));
            }

            year = input.nextInt();
            if (year > ZERO) {
                return year;
            }
            System.out.println(message.getString("takePriceToFilterMsg2"));
        }
    }

    static Integer takeMileageToFilter() {
        System.out.println(message.getString("takeMileageToFilterMsg1"));

        Integer maxMileage;

        while (true) {
            while (!input.hasNextInt()) {
                input.next();
                System.out.println(message.getString("defaultMessage2"));
            }
            maxMileage = input.nextInt();
            if (maxMileage.compareTo(ZERO) > ZERO) {
                return maxMileage;
            }
            System.out.println(message.getString("takeMileageToFilterMsg2"));
        }
    }

    static String formatDate(LocalDateTime localTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localTime.format(formatter);
    }

    static void showAccountHistory(List<AccountHistoryObject> accountHistory) {

        System.out.println(message.getString("showAccountHistoryMsg1"));
        System.out.println("==================");

        if (accountHistory.size() == EMPTY_LIST) {
            System.out.println(message.getString("showAccountHistoryMsg2") + '\n');
            return;
        }

        for (AccountHistoryObject obj : accountHistory) {
            System.out.println(obj);
        }
        System.out.println();
    }
}
