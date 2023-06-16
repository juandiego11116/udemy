package org.juangarcia.poo.abstractsclass.form;

import org.juangarcia.poo.abstractsclass.form.elements.*;
import org.juangarcia.poo.abstractsclass.form.elements.select.Option;
import org.juangarcia.poo.abstractsclass.form.validator.*;


import java.util.Arrays;
import java.util.List;

public class FormExample {
    public static void main(String[] args) {

        FormInput username = new FormInput("username");
        username.addValidator(new RequiredValidator());

        FormInput password = new FormInput("password", "password");
        password.addValidator(new RequiredValidator())
                .addValidator(new LargeValidator(6,12));
        FormInput email = new FormInput("email", "email");
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());
        FormInput age = new FormInput("age", "number");
        age.addValidator(new NumberValidator());

        FormTextArea experience = new FormTextArea("experience", 5,9);

        FormSelect language = new FormSelect("language");
        Option java = new Option("1", "Java");
        language.AddOption(java)
            .AddOption(new Option("2","Python").setSelected(true))
            .AddOption(new Option("3","javaScript"))
            .AddOption(new Option("4","TypeScript"))
            .AddOption(new Option("5","PHP"));
        language.addValidator(new NoNullValidator());


        FormElements saludar = new FormElements("Saludo") {
            @Override
            public String HTMLDraw() {
                return "<input disabled name='"+this.name+"' value=\""+this.value+"\">";
            }
        };

        saludar.setValue("Este campo esta deshabilitado");
        username.setValue("juan.garcia");
        password.setValue("123qw");
        email.setValue("juan.garcia@gmail.com");
        age.setValue("30");
        experience.setValue("mucha experiencia");
        //java.setSelected(true);

        List<FormElements> elements  = Arrays.asList(username,
                password,
                email,
                age,
                experience,
                language,
                saludar);


        elements.forEach(e ->{
            System.out.println(e.HTMLDraw());
            System.out.println("<br>");
        });
        elements.forEach(e ->{
            if(!e.isValid()){
                e.getErrors().forEach(System.out::println);
            }
        });
    }
}
