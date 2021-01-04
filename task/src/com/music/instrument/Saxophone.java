package com.music.instrument;

public final class Saxophone extends WindInstrument {

    public Saxophone() {

    }

    public Saxophone(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        System.out.println("Saxophone plays");
    }

    @Override
    public String toString() {
        return "Saxophone{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
