package org.juangarcia.poointerfaces.printig.model;

import java.util.ArrayList;

public class Resume extends Paper{

    private String person;
    private String career;
    private ArrayList<String> experiences;

    public Resume(String content, String person, String career, ArrayList<String> experiences) {
        super(content);
        this.person = person;
        this.career = career;
        this.experiences = experiences;
    }

    public Resume addExperience(String experience){
        experiences.add(experience);
        return this;
    }

    @Override
    public String print() {
        return null;
    }
}
