package com.springStudy.propertyEditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatePropertyEditor extends PropertyEditorSupport {
    private String format ="yyyy-mm-dd";

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat date= new SimpleDateFormat(format);
        try {
            setValue(date.parse(text));
        } catch (ParseException e) {
            e.printStackTrace();
            setValue("");
        }
    }
}
