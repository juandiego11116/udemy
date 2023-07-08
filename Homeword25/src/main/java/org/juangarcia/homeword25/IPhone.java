package org.juangarcia.homeword25;

public class IPhone extends Electronic implements IProduct{
    String color;
    String model;
    int price;

    public IPhone(String fabricator, String color, String model, int price) {
        super(fabricator);
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
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
