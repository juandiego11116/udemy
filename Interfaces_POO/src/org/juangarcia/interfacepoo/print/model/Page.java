package org.juangarcia.interfacepoo.print.model;

public class Page extends Paper implements Printable {
    public Page(String content) {
        super(content);
    }

    @Override
    public String printing() {
        return this.content;
    }
}
