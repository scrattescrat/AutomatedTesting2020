package com.music.event;

import com.music.instrument.KeyboardInstrument;
import com.music.instrument.StringedInstrument;
import com.music.instrument.WindInstrument;

public class Orhester {
    private KeyboardInstrument keyboardInstrument;
    private WindInstrument windInstrument;
    private StringedInstrument stringedInstrument;

    public Orhester(){
    }

    public Orhester(KeyboardInstrument keyboardInstrument, WindInstrument windInstrument, StringedInstrument stringedInstrument){
        this.keyboardInstrument = keyboardInstrument;
        this.windInstrument = windInstrument;
        this.stringedInstrument = stringedInstrument;
    }

    public void setKeyboardInstrument(KeyboardInstrument keyboardInstrument) {
        this.keyboardInstrument = keyboardInstrument;
    }

    public void setStringedInstrument(StringedInstrument stringedInstrument) {
        this.stringedInstrument = stringedInstrument;
    }

    public void setWindInstrument(WindInstrument windInstrument) {
        this.windInstrument = windInstrument;
    }

    public KeyboardInstrument getKeyboardInstrument() {
        return keyboardInstrument;
    }

    public StringedInstrument getStringedInstrument() {
        return stringedInstrument;
    }

    public WindInstrument getWindInstrument() {
        return windInstrument;
    }

    public void playConcert(){
        keyboardInstrument.play();
        windInstrument.play();
        stringedInstrument.play();
    }
}
