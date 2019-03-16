package org.carshop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Car {

    public static enum carFeatures {
        Marka,
        Cena,
        rokProdukcji,
        Przebieg,
        liczbaDrzwi,
        Kolor
    }

    private String make;
    private BigDecimal price;
    private int door;
    private int year;
    private int milage;
    private String color;

    public Car(String color, String make, BigDecimal price, int door, int year, int milage) {
        this.color = color;
        this.make = make;
        this.price = price;
        this.door = door;
        this.year = year;
        this.milage = milage;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getDoor() {
        return door;
    }

    public int getYear() {
        return year;
    }

    public int getMilage() {
        return milage;
    }


    public String toString() {

//        System.out.printf("%10s %10s %10s %10s %10s %10s",
//                carFeatures.Marka,
//                carFeatures.Cena,
//                carFeatures.rokProdukcji,
//                carFeatures.Przebieg,
//                carFeatures.liczbaDrzwi,
//                carFeatures.Kolor);

        return String.format("%10s %10f %10d %10d %10d %10s",make, price, year, milage, door, color );

    }
}
