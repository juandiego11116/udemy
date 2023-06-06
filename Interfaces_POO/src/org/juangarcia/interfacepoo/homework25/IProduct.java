package org.juangarcia.interfacepoo.homework25;

public interface IProduct {
    int DEFAULT_PRICE_INT = 0;
    double DEFAULT_PRICE_DOUBLE = 0;
    default int getPrice() {
        return DEFAULT_PRICE_INT;
    }

    default double getSalePrice(){
        return DEFAULT_PRICE_DOUBLE;
    }

}
