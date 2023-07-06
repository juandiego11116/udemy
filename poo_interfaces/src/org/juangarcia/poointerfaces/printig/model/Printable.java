package org.juangarcia.poointerfaces.printig.model;

public interface Printable {

    default String print(){
        return "Hola";
    }
     static void print(Printable printable){
        System.out.println(printable.print());
    }
}
