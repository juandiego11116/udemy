package org.juangarcia.interfacepoo.print.model;

public interface Printable {
    String DEFAULT_TEXT = "Imprimiendo un valor por defecto";

    default String printing(){
        return DEFAULT_TEXT;
    }

    static void printing(Printable printable){
        System.out.println(printable.printing());
    }
}
