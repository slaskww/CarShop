package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class CarUtil {

   public static Scanner input = new Scanner(System.in);

    public static void showList(List<Car> list){

        if (list.size()  ==  0){
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
                System.out.println((i+1) + "." + list.get(i).toString());
            }
        System.out.println();
    }

    public static Car newCar(){

        String make;
        String color;
        BigDecimal price;
        int door;
        int year;
        int mileage;

        input.nextLine();
        System.out.println("Podaj nazwę producenta: ");
        make = input.nextLine();

        System.out.println("Podaj cenę pojazdu: ");
        price = input.nextBigDecimal();

        System.out.println("Podaj rok produkcji: ");
        year = input.nextInt();

        System.out.println("Podaj przebieg (w km): ");
        mileage = input.nextInt();

        System.out.println("Podaj liczbe drzwi: ");
        door = input.nextInt();

        System.out.println("Podaj kolor pojazdu: ");
        color = input.next();

        return new Car(color, make, price, door, year, mileage);

    }

    public static Car removeCarMenu(List<Car> list){

        if (list.size() == 0){
            System.out.println("Lista jest pusta.");
            return null;
        }

        System.out.println("Podaj numer pojazdu, który usunąć z listy: ");
        System.out.println("------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + "." + list.get(i).getMake());
        }

        int toRemove = input.nextInt();
        if (toRemove == 0 || toRemove > list.size()){
            System.out.println("Wybrałeś numer spoza zakresu listy!");
            return null;
        }
       System.out.println("Pojazd "+ list.get(toRemove-1).getMake() + " został usunięty");
       return list.get(toRemove-1);
    }

    public static int showMainMenu(){

        System.out.println("1 - dodaj nowy pojazd");
        System.out.println("2 - usuń pojazd");
        System.out.println("3 - wyświetl listę");
        System.out.println("4 - sortuj listę");
        System.out.println("5 - filtruj listę");
        System.out.println("6 - filtruj i sortuj listę");
        System.out.println("9 - zakończ program");

        return input.nextInt();
    }

    public static void showTitle(){
        System.out.println("=========================");
        System.out.println("|  CAR DEALER MANAGER   |");
        System.out.println("=========================");
    }


    public static int showSortMenu(){
        System.out.println("Posortuj listę po:");
        System.out.println("1 - marce pojazdu");
        System.out.println("2 - cenie pojazdu");
        System.out.println("3 - roku produkcji");
        System.out.println("4 - przebiegu");
        System.out.println("5 - liczbie drzwi");
        System.out.println("6 - kolorze karoserii");

        return input.nextInt();
    }

    public static int showFilterMenu(){
        System.out.println("Przefiltruj listę po:");
        System.out.println("1 - marce pojazdu");
        System.out.println("2 - cenie pojazdu");
        System.out.println("3 - roku produkcji");
        System.out.println("4 - przebiegu");
        System.out.println("5 - liczbie drzwi");
        System.out.println("6 - kolorze karoserii");

        return input.nextInt();
    }

}
