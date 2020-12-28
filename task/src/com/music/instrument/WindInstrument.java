package com.music.instrument;

public abstract class WindInstrument implements Instrument{
    private String manufacturer;
    private int price;
    public final String TYPE = "WIND_INSTRUMENT_TYPE";

    public WindInstrument() {

    }

    public WindInstrument(String manufacturer, int price){
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

    public final void printManufacturer(){
        System.out.println("===Manufacturer===");
        System.out.println("        " + manufacturer);
    }

    @Override
    public void play() {
        System.out.println("Wind Instrument plays");
    }

    @Override
    public void printFields() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
}
