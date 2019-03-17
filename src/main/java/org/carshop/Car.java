package org.carshop;

import java.math.BigDecimal;

public class Car {

    public static enum carFeatures {
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

    public Car(String color, String make, BigDecimal price, int door, int year, int milage) {
        this.color = color;
        this.make = make;
        this.price = price;
        this.door = door;
        this.year = year;
        this.mileage = milage;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public BigDecimal getPrice() { return price;}

    public int getDoor() {
        return door;
    }

    public int getYear() {
        return year;
    }

    public int getMilage() {
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
