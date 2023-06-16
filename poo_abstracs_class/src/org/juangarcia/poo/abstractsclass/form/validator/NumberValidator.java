package org.juangarcia.poo.abstractsclass.form.validator;

public class NumberValidator extends Validator{

    protected String message = "Field %s is not a number";
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
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }


    }
}
