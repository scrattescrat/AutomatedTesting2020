package com.music.instrument;

public final class Violin extends StringedInstrument {

    public Violin() {

    }

    public Violin(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Violin plays");
    }

    @Override
    public String toString() {
        return "Violin{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
