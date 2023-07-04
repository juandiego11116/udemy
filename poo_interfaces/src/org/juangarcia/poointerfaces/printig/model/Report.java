package org.juangarcia.poointerfaces.printig.model;

public class    Report extends Paper{

    private String author;
    private String reviewer;

    public Report(String content, String author, String reviewer) {
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
