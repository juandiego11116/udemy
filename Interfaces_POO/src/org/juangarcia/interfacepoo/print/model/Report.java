package org.juangarcia.interfacepoo.print.model;

public class Report extends Page implements Printable{
    private Person author;
    private Person revisor;

    public Report(Person author, Person revisor, String content) {
        super(content);
        this.author = author;
        this.revisor = revisor;
    }

    @Override
    public String printing() {
        return "Informe escrito por: " + author
                + " Revisado por: " + revisor
                + "\n" + this.content;
    }
}
