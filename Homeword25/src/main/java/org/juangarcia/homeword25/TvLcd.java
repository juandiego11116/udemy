package org.juangarcia.homeword25;

public class TvLcd extends Electronic implements IProduct{

    int inch;
    int price;

    public TvLcd(String fabricator, int inch, int price) {
        super(fabricator);
        this.inch = inch;
        this.price = price;

    }

    public int getInch() {
        return inch;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getPriceSell() {
        double gain = price * 0.1;

        return price + gain;
    }

}
