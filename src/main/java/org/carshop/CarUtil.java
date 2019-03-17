package org.carshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class CarUtil {

    static Locale currentLocale;
    static ResourceBundle messages;

    static void changeLanguage(){

        System.out.println("Wybierz \n1 dla PL\n2 dla EN");
        int c = input.nextInt();
        if (c == 1){
            currentLocale = new Locale("pl", "PL");

        } else {
            currentLocale = new Locale("en", "US");
        }

        messages = ResourceBundle.getBundle("Bundle",currentLocale);
    }

    private static Scanner input = new Scanner(System.in);

    private CarUtil() {
    }

    static void showList(List<Car> list) {

        if (list.size() == 0) {
            System.out.println("Lista jest pusta.");
            return;
        }
        System.out.printf("Lp.  %-15s %-15s %-15s %-15s %-15s %-15s\n",
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

//        System.out.println("Podaj nazwę producenta: ");
//        make = input.nextLine();
//        System.out.println("Podaj cenę pojazdu: ");
//        price = input.nextBigDecimal();
//        System.out.println("Podaj rok produkcji: ");
//        year = input.nextInt();
//        System.out.println("Podaj przebieg (w km): ");
//        mileage = input.nextInt();
//        System.out.println("Podaj liczbe drzwi: ");
//        door = input.nextInt();
//        System.out.println("Podaj kolor pojazdu: ");
        color = input.next();

        return new Car(color, make, price, door, year, mileage);

    }

    static Car removeCarMenu(List<Car> list) {

        if (list.size() == 0) {
            System.out.println("Lista jest pusta.");
            return null;
        }
        System.out.println("Podaj numer pojazdu, który usunąć z listy: ");
        System.out.println("------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i).getMake());
        }

        int toRemove = input.nextInt();
        if (toRemove == 0 || toRemove > list.size()) {
            System.out.println("Wybrałeś numer spoza zakresu listy!");
            return null;
        }
        System.out.println("Pojazd " + list.get(toRemove - 1).getMake() + " został usunięty");
        return list.get(toRemove - 1);
    }

    static int showMainMenu() {

        System.out.println("1 - dodaj nowy pojazd");
        System.out.println("2 - usuń pojazd");
        System.out.println("3 - wyświetl listę");
        System.out.println("4 - sortuj listę");
        System.out.println("5 - filtruj listę");
        System.out.println("6 - filtruj i sortuj listę");
        System.out.println("7 - sprawdź stan konta");
        System.out.println("9 - zakończ program");

        return input.nextInt();
    }

    static void showTitle() {
        System.out.println("=========================");
        System.out.println("|  CAR DEALER MANAGER   |");
        System.out.println("=========================");
    }


    static int showSortMenuAndReturnChoiceNumber() {
        System.out.println("Posortuj listę po:");
        System.out.println("1 - marce pojazdu");
        System.out.println("2 - cenie pojazdu");
        System.out.println("3 - roku produkcji");
        System.out.println("4 - przebiegu");
        System.out.println("5 - liczbie drzwi");
        System.out.println("6 - kolorze karoserii");

        return input.nextInt();
    }

    static int showFilterMenuAndReturnChoice() {
        System.out.println("Przefiltruj listę po:");
        System.out.println("1 - marce pojazdu");
        System.out.println("2 - cenie pojazdu");
        System.out.println("3 - roku produkcji");
        System.out.println("4 - przebiegu");
        System.out.println("5 - liczbie drzwi");
        System.out.println("6 - kolorze karoserii");

        return input.nextInt();
    }

    static String takeMakeToFilter(List<Car> list) {

        Set<String> makes = new TreeSet<>();
        for (Car car : list) {
            makes.add(car.getMake());
        }

        System.out.println("Podaj markę pojazdu:");
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

        System.out.println("Podaj liczbę drzwi:");
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


        System.out.println("Podaj kolor karoserii:");
        for (String s : colors) {
            System.out.println(s);
        }
        input.nextLine();
        return input.nextLine();
    }

    static BigDecimal takePriceToFilter() {
        System.out.println("Podaj maksymalną cenę");

        BigDecimal maxPrice = input.nextBigDecimal();
        if (maxPrice.compareTo(new BigDecimal(0)) < 0) {
            System.out.println("Cena  nie może być ujemna");
            return new BigDecimal(0);
        }
        return maxPrice;
    }

    static Integer takeYearToFilter(List<Car> list) {

        Set<Integer> years = new TreeSet<>();
        for (Car car : list) {
            years.add(car.getYear());
        }

        System.out.println("Podaj rocznik:");
        for (Integer s : years) {
            System.out.println(s);
        }
        return input.nextInt();
    }

    static Integer takeMileageToFilter() {
        System.out.println("Podaj maksymalny przebieg");

        Integer maxMileage = input.nextInt();
        if (maxMileage.compareTo(0) < 0) {
            System.out.println("przebieg  nie może być ujemny");
            return 0;
        }
        return maxMileage;
    }

    static String formatDate(LocalDateTime localTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localTime.format(formatter);
    }

    static void showAccountHistory(List<AccountHistoryObject> accountHistory) {

        System.out.println("Historia rachunku:");
        System.out.println("==================");

        if (accountHistory.size() == 0) {
            System.out.println("Historia jest pusta\n");
            return;
        }

        for (AccountHistoryObject obj : accountHistory) {
            System.out.println(obj);
        }
        System.out.println();
    }
}
