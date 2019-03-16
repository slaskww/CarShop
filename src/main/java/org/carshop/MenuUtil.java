package org.carshop;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class MenuUtil {

    public static void showCars(List<Car> list){

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",
                Car.carFeatures.Marka,
                Car.carFeatures.Cena,
                Car.carFeatures.rokProdukcji,
                Car.carFeatures.Przebieg,
                Car.carFeatures.liczbaDrzwi,
                Car.carFeatures.Kolor);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + "." + list.get(i).toString());
        }
    }


    public static Car newCar(){
        Scanner input = new Scanner(System.in);

        String make;
        String color;
        BigDecimal price;
        int door;
        int year;
        int milage;

        System.out.println("Podaj nazwę producenta: ");
        make = input.nextLine();

        System.out.println("Podaj cenę pojazdu: ");
        price = input.nextBigDecimal();

        System.out.println("Podaj rok produkcji: ");
        year = input.nextInt();

        System.out.println("Podaj przebieg (w km): ");
        milage = input.nextInt();

        System.out.println("Podaj liczbe drzwi: ");
        door = input.nextInt();

        System.out.println("Podaj kolor pojazdu: ");
        color = input.next();

        return new Car(color, make, price, door, year, milage);

    }

    public static void removeMenu(List<Car> cars){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj numer pojazdu, który usunąć: ");
        System.out.println("---------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i+1) + "." + cars.get(i).getMake());
        }

        int choice

        cars.get()
    }


}
