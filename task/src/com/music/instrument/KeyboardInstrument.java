package com.music.instrument;

public abstract class KeyboardInstrument implements Instrument{
    private String manufacturer;
    private int price;

    public KeyboardInstrument() {
    }

    public KeyboardInstrument(String manufacturer, int price){
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
        System.out.println("Keyboard Instrument plays");
    }

    @Override
    public void printFields() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
}
