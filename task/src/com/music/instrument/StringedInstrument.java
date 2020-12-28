package com.music.instrument;

public abstract class StringedInstrument implements Instrument{
    private String manufacturer;
    private int price;

    public StringedInstrument() {

    }

    public StringedInstrument(String manufacturer, int price){
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void play() {
        System.out.println("Stringed Instrument plays");
    }

    @Override
    public void printFields() {
        System.out.println("Manufactuter: " + manufacturer);
        System.out.println("Price: " + price);
    }
}
