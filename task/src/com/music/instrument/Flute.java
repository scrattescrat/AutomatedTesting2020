package com.music.instrument;

public final class Flute extends WindInstrument {
    public Flute() {

    }

    public Flute(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Flute plays");
    }

    @Override
    public String toString() {
        return "Flute{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
