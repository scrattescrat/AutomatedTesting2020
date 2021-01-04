package com.music.instrument;

public final class Piano extends KeyboardInstrument {
    private String colour;

    public Piano() {
    }

    public Piano(String colour) {
        this.colour = colour;
    }

    public Piano(String manufacturer, int price, String colour) {
        super(manufacturer, price);
        this.colour = colour;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public void play() {
        System.out.println("Piano plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("Colour: " + colour);
    }

    @Override
    public String toString() {
        return "Piano{" +
                "TYPE='" + TYPE + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
