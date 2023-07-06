package org.juangarcia.poointerfaces.printig;

import org.juangarcia.poointerfaces.printig.model.*;
import static org.juangarcia.poointerfaces.printig.model.Printable.print;

public class PrintingExample {
    public static void main(String[] args) {

        Resume resume = new Resume(new Person("Juan","Garcia"),"Laboral Resume","System" );
        resume.addExperience("Java")
            .addExperience("Oracle DBA");

        Book book = new Book(new Person("Juan","Garcia"), "Patron de diseños", Gender.HUMOR);

        book.addPage(new Page("Patron singleton"));
        book.addPage(new Page("Patron builder"));
        Report report = new Report("Studied JAva",new Person("Juan","Garcia"), new Person("Luna","Garcia"));
        print(book);
        print(resume);
        print(report);
    }

}
