package com.company.Excercise_29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private String title;
    private float value;

    public CurrencyInfo(String title, float value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public float getValue() {
        return value;
    }

    public String toString(){
        return title + ": " + value;
    }
}
