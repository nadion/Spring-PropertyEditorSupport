package com.springStudy.bean;


import java.util.Date;

public class User {
    private Date date;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString();
    }
}
