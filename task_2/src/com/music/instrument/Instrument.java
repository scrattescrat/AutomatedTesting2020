package com.music.instrument;

public class Instrument {
    private String manufacturer;
    private int price;

    public Instrument() {
        manufacturer = "default";
        price = 1;
    }

    public Instrument(String manufacturer1, int price1) {
        manufacturer = manufacturer1;
        price = price1;
    }

    public void setManufacturer(String manufacturer2) {
        manufacturer = manufacturer2;
    };

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(int price2) {
        price = price2;
    }

    public int getPrice() {
        return price;
    }

    public void printFields() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
}
