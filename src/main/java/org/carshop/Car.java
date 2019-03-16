package org.carshop;

import java.math.BigDecimal;

public class Car {

private String color;
private String make;
private BigDecimal price;
private int door;
private int year;
private int milage;

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
}
