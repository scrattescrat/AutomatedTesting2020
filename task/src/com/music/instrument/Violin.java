package com.music.instrument;

public class Violin extends StringedInstrument {

    public Violin() {

    }

    public Violin(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Violin plays");
    }

}
