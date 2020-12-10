package com.music.instrument;

public class Piano extends KeyboardInstrument{
    private String colour;

    public Piano() {
    }

    public Piano(String colour1) {
        colour = colour1;
    }

    public void setColour (String colour2) {
        colour = colour2;
    }

    public String getColour() {
        return colour;
    }

    public void printColour(){
        System.out.println("Colour: " + colour);
    }
}
