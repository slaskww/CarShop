package org.carshop;

import java.math.BigDecimal;

public class Car {

    public enum carFeatures {
        MAKE,
        PRICE,
        YEAR,
        MILEAGE,
        DOOR,
        COLOR
    }

    private String make;
    private BigDecimal price;
    private int door;
    private int year;
    private int mileage;
    private String color;

    Car(String color, String make, BigDecimal price, int door, int year, int mileage) {
        this.color = color;
        this.make = make;
        this.price = price;
        this.door = door;
        this.year = year;
        this.mileage = mileage;
    }

     String getColor() {
        return color;
    }

     String getMake() {
        return make;
    }

     BigDecimal getPrice() { return price;}

     int getDoor() {
        return door;
    }

     int getYear() {
        return year;
    }

     int getMileage() {
        return mileage;
    }


    public String toString() {
        return String.format("   %-15s %-15.2f %-15d %-15d %-15d %-15s",
                make,
                price,
                year,
                mileage,
                door,
                color );

    }
}
