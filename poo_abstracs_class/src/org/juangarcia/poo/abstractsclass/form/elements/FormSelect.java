package org.juangarcia.poo.abstractsclass.form.elements;

import org.juangarcia.poo.abstractsclass.form.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

public class FormSelect extends FormElements{

    private List<org.juangarcia.poo.abstractsclass.form.elements.select.Option>options;

    public FormSelect(String name) {
        super(name);
        this.options = new ArrayList<org.juangarcia.poo.abstractsclass.form.elements.select.Option>();
    }

    public FormSelect(String name, List<org.juangarcia.poo.abstractsclass.form.elements.select.Option> options) {
        super(name);
        this.options = options;
    }

    public FormSelect AddOption(org.juangarcia.poo.abstractsclass.form.elements.select.Option option){
        this.options.add(option);
        return this;
    }
    @Override
    public String HTMLDraw() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.name)
                .append("'>");
        for(Option option: this.options){
            sb.append("\n<option value='")
                    .append(option.getValue())
                    .append("'");
            if(option.isSelected()){
                sb.append(" selected");
                this.value = option.getValue();
            }
            sb.append(">")
                    .append(option.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
