package org.juangarcia.interfacepoo.print.model;

abstract public class Paper {
    protected String content;

    public Paper(String content) {
        this.content = content;
    }

    abstract public String printing();
}
