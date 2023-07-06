package org.juangarcia.poointerfaces.printig.model;

public class Page extends Paper{

    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return content;
    }
}
