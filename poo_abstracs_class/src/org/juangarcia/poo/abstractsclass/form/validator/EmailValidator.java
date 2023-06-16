package org.juangarcia.poo.abstractsclass.form.validator;

public class EmailValidator extends Validator{
    protected String message = "the field %s is not a email";
    private final static String EMAIL_REGEX = "^(.+)@(.+)";
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
        return value.matches(EMAIL_REGEX);
    }
}
