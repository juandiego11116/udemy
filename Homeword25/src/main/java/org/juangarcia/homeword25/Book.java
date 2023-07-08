package org.juangarcia.homeword25;

import java.util.Date;

public class Book extends Product implements IBook{
    Date datePublication;
    String author;
    String title;
    String editorial;

    public Book(int price) {
        super(price);
    }

    public Book(int price, Date datePublication, String author, String title, String editorial) {
        super(price);
        this.datePublication = datePublication;
        this.author = author;
        this.title = title;
        this.editorial = editorial;
    }

    @Override
    public double getPriceSell() {
        double gain = price * 0.1;

        return price + gain;
    }

    @Override
    public Date getDatePublication() {
        return datePublication;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }
}
