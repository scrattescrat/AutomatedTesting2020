package com.music.instrument;

public final class Synthesizer extends KeyboardInstrument {
    private boolean electronic;

    public Synthesizer() {
    }

    public Synthesizer(boolean electronic) {
        this.electronic = electronic;
    }

    public Synthesizer(String manufacturer, int price, boolean electronic) {
        super(manufacturer, price);
        this.electronic = electronic;
    }

    public void setElectronic(boolean electronic) {
        this.electronic = electronic;
    }


    public boolean getElectronic() {
        return electronic;
    }

     @Override
    public void play() {
        System.out.println("Synthesizer plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        System.out.println("Electronic: " + electronic);
    }

    @Override
    public String toString() {
        return "Synthesizer{" +
                "TYPE='" + TYPE + '\'' +
                ", electronic=" + electronic +
                '}';
    }
}
