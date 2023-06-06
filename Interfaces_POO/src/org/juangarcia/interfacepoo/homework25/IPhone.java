package org.juangarcia.interfacepoo.homework25;

public class IPhone extends Electronic implements IProduct{
    String color;
    String model;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
    public IPhone(String factory, String color, String model) {
        super(factory);
        this.color = color;
        this.model = model;
    }
    public IPhone(String factory) {
        super(factory);
    }

    @Override
    public double getSalePrice() {
        return 0;
    }
}
