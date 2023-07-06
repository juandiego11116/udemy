package org.juangarcia.poointerfaces.printig.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printable{
    private List<Paper>  pages;
    private Person author;
    private String title;
    private Gender gender;

    public Book(Person author, String title, Gender gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Paper page){
        pages.add(page);
        return this;
    }
    public String print(){
        StringBuilder sb = new StringBuilder("Title: ");
        sb.append(this.title).append("\n")
                .append("Author: ").append(this.author).append("\n")
                .append("Gender: ").append(this.gender).append("\n");
        for (Paper page: this.pages){
            sb.append(page.print()).append("\n");
        }
        return sb.toString();
    }
}
