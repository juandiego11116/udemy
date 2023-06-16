package org.juangarcia.poo.abstractsclass.form.elements;

public class FormTextArea extends FormElements{
    private int rows;
    private int columns;

    public FormTextArea(String name) {
        super(name);
    }

    public FormTextArea(String name, int rows, int columns) {
        super(name);
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String HTMLDraw() {
        return "<textarea name='" + this.name +
                "' cols='" + this.columns +
                "' rows='" + this.rows + "'>"
                + this.value +"</textarea>";
    }
}
