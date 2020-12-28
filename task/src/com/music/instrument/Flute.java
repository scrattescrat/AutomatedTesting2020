package com.music.instrument;

public class Flute extends WindInstrument {
    public Flute() {

    }

    public Flute(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Flute plays");
    }
}
