package org.juangarcia.poo.abstractsclass.form.elements;

public class FormInput extends FormElements{

    private String type = "text";

    public FormInput(String name) {
        super(name);
    }

    public FormInput(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String HTMLDraw() {
        return "<input type=\"" + this.type
                + "\" name=\"" + this.name
                + "\" value=\"" + this.value + "\">";
    }
}
