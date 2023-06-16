package org.juangarcia.poo.abstractsclass.form.validator;

import org.juangarcia.poo.abstractsclass.form.validator.massage.MassageFormat;

public class LargeValidator extends Validator implements MassageFormat {
    protected String message = "Field %s Large must have %d minimum and %d maximum of character";
    private int min ;
    private int max = Integer.MAX_VALUE;

    public LargeValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public LargeValidator() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        //this.message = String.format(this.message,this.min,this.max);
        if(value==null){
            return true;
        }
        int large = value.length();
        return large >= min && large <= max;
    }

    public String getMassageFormat(String field){
        return String.format(this.message,field,this.min,this.max);
    }
}
