package org.juangarcia.interfacepoo.print.model;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Page implements Printable{
    private Person person;
    private String career;
    private List<String> experiences;

    public Resume(Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Resume addExperiences(String exp){
        experiences.add(exp);
        return this;
    }

    @Override
    public String printing() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append(person).append("\n")
                .append("Resumen: ").append(this.content)
                .append("\n").append("Profesión: ")
                .append(this.career).append("\n")
                .append("Experiencias: \n");
        for(String exp: this.experiences){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
