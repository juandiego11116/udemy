package org.juangarcia.interfacepoo.print;

import org.juangarcia.interfacepoo.print.model.*;
import static org.juangarcia.interfacepoo.print.model.Printable.*;

public class PrintExample {
    public static void main(String[] args) {
        Resume cv = new Resume(new Person("John", "Doe"),
                "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiences("Java")
                .addExperiences("Oracle DBA")
                .addExperiences("Spring Framework")
                .addExperiences("Desarrollador fullstack")
                .addExperiences("Angular");

        Book book =  new Book(new Person("Erich", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                Gender.PROGRAMMING);
        book.addPage(new Page("Patrón Singleton"))
                .addPage(new Page("Patrón Observador"))
                .addPage(new Page("Patrón Factory"))
                .addPage(new Page("Patrón Composite"))
                .addPage(new Page ("Patrón Facade"));

        Report report = new Report(new Person("Martin", "Fowler"),
                new Person("James", "Gosling"), "Estudio sobre microservicios");

        printing(report);
        printing(book);

        printing(new Printable(){
            @Override
            public String printing() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";}
        });

        System.out.println(DEFAULT_TEXT);
    }

}
