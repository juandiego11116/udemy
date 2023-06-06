package org.juangarcia.interfacepoo.homework25;

abstract public class Product implements IProduct{
    int prince;

    public Product(int prince) {
        this.prince = prince;
    }

    @Override
    public int getPrecio() {
        return 0;
    }
}
