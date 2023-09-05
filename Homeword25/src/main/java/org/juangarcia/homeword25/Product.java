package org.juangarcia.homeword25;

abstract public class Product implements IProduct {
    int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
