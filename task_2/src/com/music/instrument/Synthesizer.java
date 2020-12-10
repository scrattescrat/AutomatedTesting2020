package com.music.instrument;

public class Synthesizer extends KeyboardInstrument{
    private boolean electronic;

    public Synthesizer() {
    }

    public Synthesizer(boolean electronic1) {
        electronic = electronic1;
    }

    public void setElectronic(boolean electronic2) {
        electronic = electronic2;
    }

    public boolean getElectronic() {
        return electronic;
    }

    public void printElectronic() {
        System.out.println("Electronic: " + electronic);
    }
}
