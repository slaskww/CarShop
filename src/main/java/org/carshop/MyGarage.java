package org.carshop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyGarage {

   public List<Car> carList = new ArrayList<Car>();

    public MyGarage() {}

    public void addCar(){
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
        color = input.nextLine();

        carList.add(new Car(color, make, price, door, year, milage));
    }

    public void removeCar(Car car){
        carList.remove(car);
    }


    public void showCars(){

        System.out.printf("%10s %10s %10s %10s %10s %10s",
                Car.carFeatures.Marka,
                Car.carFeatures.Cena,
                Car.carFeatures.rokProdukcji,
                Car.carFeatures.Przebieg,
                Car.carFeatures.liczbaDrzwi,
                Car.carFeatures.Kolor);

        for (Car c: carList) {
            System.out.println(c.toString());
        }
    }

}
