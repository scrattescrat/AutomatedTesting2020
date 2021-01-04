package com.music.instrument;

public final class Guitar extends StringedInstrument {
    private String guitarType;

    public Guitar() {

    }

    public Guitar(String guitarType) {
        this.guitarType = guitarType;
    }

    public Guitar(String manufacturer, int price, String guitarType) {
        super(manufacturer, price);
        this.guitarType = guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void printGuitarType() {
        System.out.println("Guitar type: " + guitarType);
    }

    @Override
    public void play() {
        System.out.println("Guitar plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("Guitar type: " + guitarType);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarType='" + guitarType + '\'' +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }
}
