package com.music.instrument;

public class Guitar extends StringedInstrument{
    private String guitarType;

    public Guitar() {

    }

    public Guitar(String guitarType1) {
        guitarType = guitarType1;
    }

    public void setGuitarType(String guitarType2) {
        guitarType = guitarType2;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void printGuitarType() {
        System.out.println("Guitar type: " + guitarType);
    }
}
