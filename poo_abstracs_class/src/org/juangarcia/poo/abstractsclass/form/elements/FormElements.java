package org.juangarcia.poo.abstractsclass.form.elements;

import org.juangarcia.poo.abstractsclass.form.validator.LargeValidator;
import org.juangarcia.poo.abstractsclass.form.validator.Validator;
import org.juangarcia.poo.abstractsclass.form.validator.massage.MassageFormat;

import java.util.ArrayList;
import java.util.List;

abstract public class FormElements {
  protected String value;
  protected String name;

  private List<Validator> validators;
  private List<String> errors;

  public FormElements() {
      this.validators = new ArrayList<>();
      this.errors = new ArrayList<>();
  }

  public FormElements(String name) {
   this();
   this.name = name;
  }

  public FormElements addValidator(Validator validator){
      this.validators.add(validator);
      return this;
  }

    public List<String> getErrors() {
        return errors;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid() {
        for (Validator v : validators) {
            if (!v.isValid(this.value)) {
                if(v instanceof MassageFormat){
                    this.errors.add(((MassageFormat) v).getMassageFormat(name));
                }else {
                    this.errors.add(String.format(v.getMessage(), name));
                }
            }
        }
        return this.errors.isEmpty();
    }
    abstract public String HTMLDraw();
}
