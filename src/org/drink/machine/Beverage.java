package org.drink.machine;

public class Beverage extends Product {
    public static int number = 1;

    private transient double volume;

    public Beverage(String name, double price) {
        super(name, price);
    }

    public Beverage(String name, double price, int count) {
        super(name, price, count);
    }

    public Beverage(String name, double v, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
