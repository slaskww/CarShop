package org.carshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class CarUtil {

   private static Locale currentLocale =  null;
   private static ResourceBundle messages;
   private static Scanner input = new Scanner(System.in);

   private CarUtil() {
    }


    static void changeLanguage(){
        if (currentLocale == null){
            messages = ResourceBundle.getBundle("Bundle", new Locale("pl", "PL"));
        }

        System.out.println(
                messages.getString("changeLanguageMsg1") + "\n" +
                messages.getString("changeLanguageOptPl") + "\n" +
                messages.getString("changeLanguageOptEn"));

        int c = input.nextInt();
        if (c == 1){
            currentLocale = new Locale("pl", "PL");
        } else if (c == 2){
            currentLocale = new Locale("en", "US");
        } else {
            currentLocale = new Locale("sua", "SUA");
        }

        messages = ResourceBundle.getBundle("Bundle",currentLocale);
    }

    static void defaultMessage(){
        System.out.println(messages.getString("defaultMessage"));
    }

    static void showList(List<Car> list) {

        if (list.size() == 0) {
            System.out.println(messages.getString("showListCommunicate"));
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

        input.nextLine();
        System.out.println(messages.getString("make"));
        make = input.nextLine();
        System.out.println(messages.getString("price"));
        price = input.nextBigDecimal();
        System.out.println(messages.getString("year"));
        year = input.nextInt();
        System.out.println(messages.getString("mileage"));
        mileage = input.nextInt();
        System.out.println(messages.getString("door"));
        door = input.nextInt();
        System.out.println(messages.getString("color"));

        color = input.next();

        return new Car(color, make, price, door, year, mileage);

    }

    static Car removeCarMenu(List<Car> list) {

        if (list.size() == 0) {
            System.out.println(messages.getString("showListCommunicate"));
            return null;
        }
        System.out.println(messages.getString("removeCarMenuMsg1"));

        showList(list);

        int toRemove = input.nextInt();
        if (toRemove == 0 || toRemove > list.size()) {
            System.out.println(messages.getString("removeCarMenuMsg2"));
            return null;
        }
        System.out.println(
                messages.getString("removeCarMenuMsg3") + " " +
                list.get(toRemove - 1).getMake() + " " +
                messages.getString("removeCarMenuMsg4"));

        return list.get(toRemove - 1);
    }

    static int showMainMenu() {

        System.out.println(messages.getString("showMainMenuMsg1"));
        System.out.println(messages.getString("showMainMenuMsg2"));
        System.out.println(messages.getString("showMainMenuMsg3"));
        System.out.println(messages.getString("showMainMenuMsg4"));
        System.out.println(messages.getString("showMainMenuMsg5"));
        System.out.println(messages.getString("showMainMenuMsg6"));
        System.out.println(messages.getString("showMainMenuMsg7"));
        System.out.println(messages.getString("showMainMenuMsg8"));
        System.out.println(messages.getString("showMainMenuMsg9"));

        return input.nextInt();
    }

    static void showTitle() {
        System.out.println("=========================");
        System.out.println("|  CAR DEALER MANAGER   |");
        System.out.println("=========================");
    }


    static int showSortMenuAndReturnChoiceNumber() {
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg1"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg2"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg3"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg4"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg5"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg6"));
        System.out.println(messages.getString("showSortMenuAndReturnChoiceNumberMsg7"));

        return input.nextInt();
    }

    static int showFilterMenuAndReturnChoice() {
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg1"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg2"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg3"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg4"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg5"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg6"));
        System.out.println(messages.getString("showFilterMenuAndReturnChoiceMsg7"));

        return input.nextInt();
    }

    static String takeMakeToFilter(List<Car> list) {

        Set<String> makes = new TreeSet<>();
        for (Car car : list) {
            makes.add(car.getMake());
        }

        System.out.println(messages.getString("takeMakeToFilterMsg"));
        for (String s : makes) {
            System.out.println(s);
        }
        input.nextLine();
        return input.nextLine();
    }

    static int takeDoorToFilter(List<Car> list) {

        Set<Integer> prices = new TreeSet<>();
        for (Car car : list) {
            prices.add(car.getDoor());
        }

        System.out.println(messages.getString("takeDoorToFilterMsg"));
        for (Integer s : prices) {
            System.out.println(s);
        }
        return input.nextInt();
    }

    static String takeColorToFilter(List<Car> list) {

        Set<String> colors = new TreeSet<>();
        for (Car car : list) {
            colors.add(car.getColor());
        }

        System.out.println(messages.getString("takeColorToFilterMsg"));
        for (String s : colors) {
            System.out.println(s);
        }
        input.nextLine();
        return input.nextLine();
    }

    static BigDecimal takePriceToFilter() {
        System.out.println(messages.getString("takePriceToFilterMsg1"));

        BigDecimal maxPrice = input.nextBigDecimal();
        if (maxPrice.compareTo(new BigDecimal(0)) < 0) {
            System.out.println(messages.getString("takePriceToFilterMsg2"));
            return new BigDecimal(0);
        }
        return maxPrice;
    }

    static Integer takeYearToFilter(List<Car> list) {

        Set<Integer> years = new TreeSet<>();
        for (Car car : list) {
            years.add(car.getYear());
        }

        System.out.println(messages.getString("takeYearToFilterMsg"));
        for (Integer s : years) {
            System.out.println(s);
        }
        return input.nextInt();
    }

    static Integer takeMileageToFilter() {
        System.out.println(messages.getString("takeMileageToFilterMsg1"));

        Integer maxMileage = input.nextInt();
        if (maxMileage.compareTo(0) < 0) {
            System.out.println(messages.getString("takeMileageToFilterMsg2"));
            return 0;
        }
        return maxMileage;
    }

    static String formatDate(LocalDateTime localTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localTime.format(formatter);
    }

    static void showAccountHistory(List<AccountHistoryObject> accountHistory) {

        System.out.println(messages.getString("showAccountHistoryMsg1"));
        System.out.println("==================");

        if (accountHistory.size() == 0) {
            System.out.println(messages.getString("showAccountHistoryMsg2"));
            return;
        }

        for (AccountHistoryObject obj : accountHistory) {
            System.out.println(obj);
        }
        System.out.println();
    }
}
