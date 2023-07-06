package org.juangarcia.poointerfaces.printig.model;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Paper implements Printable{

    private Person person;
    private String career;
    private List<String> experiences;


    public Resume( Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = new ArrayList<>();
    }

    public Resume addExperience(String experience){
        experiences.add(experience);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append("Resume: ").append(this.content)
                .append("\n").append("Profession")
                .append(this.career).append("\n")
                .append("Experience: \n");
        for (String exp: this.experiences){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
