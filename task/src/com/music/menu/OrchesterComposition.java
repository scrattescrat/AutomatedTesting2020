package com.music.menu;

import com.music.event.Orhester;
import com.music.instrument.*;

public class OrchesterComposition {
    public static void createOrchester(){
        Orhester orhester = new Orhester();

        KeyboardInstrument piano1 = new Piano("Steinway & Sons", 75000,"white");
        KeyboardInstrument piano2 = new Piano("Steinway & Sons", 73000,"red");
        KeyboardInstrument synthesizer = new Synthesizer("Yamaha", 4755, true);


        orhester.addKeyboardInstrument(piano1);
        orhester.addKeyboardInstrument(piano2);
        orhester.addKeyboardInstrument(synthesizer);

        orhester.printInfo();


    }
}
