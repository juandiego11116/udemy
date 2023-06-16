package org.juangarcia.poo.abstractsclass.form.validator;

public class NoNullValidator extends Validator{
    protected String message = " Field %s can not be null";
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
        return (value != null);
    }
}
