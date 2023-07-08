package org.juangarcia.homeword25;

public class Comics extends Book{

    String character;

    public Comics(int price, String character) {
        super(price);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public double getPriceSell() {
        double gain = price * 0.1;

        return price + gain;
    }
}
