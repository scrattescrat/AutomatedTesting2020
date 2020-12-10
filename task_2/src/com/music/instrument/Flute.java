package com.music.instrument;

public class Flute extends WindInstrument {
    private String fluteType;

    public Flute() {

    }

    public Flute(String fluteType1) {
        fluteType = fluteType1;
    }

    public void setFluteType(String fluteType2) {
        fluteType = fluteType2;
    }

    public String getFluteType() {
        return fluteType;
    }

    public void printFluteType() {
        System.out.println("Flute type: " + fluteType);
    }
}
