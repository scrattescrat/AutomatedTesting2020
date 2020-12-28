package com.music.instrument;

public class Saxophone extends WindInstrument {

    public Saxophone() {

    }

    public Saxophone(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Saxophone plays");
    }

}
