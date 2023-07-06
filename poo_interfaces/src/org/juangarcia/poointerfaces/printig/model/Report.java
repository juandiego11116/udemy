package org.juangarcia.poointerfaces.printig.model;

public class Report extends Paper implements Printable{

    private Person author;
    private Person reviewer;

    public Report(String content, Person author, Person reviewer) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Report written by: " + author
                + "Reviewed by: " + reviewer
                + "\n " + this.content;
    }
}
