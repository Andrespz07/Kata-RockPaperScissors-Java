package com.factoriaf5.rps.models;

public abstract class Figure {
    private String type;

    public Figure(String string){
        this.type = string;
    }

    public String getType() {
        return type;
    }

}
