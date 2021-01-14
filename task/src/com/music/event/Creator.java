package com.music.event;

import com.music.instrument.*;

public class Creator {

    public Instrument createInstrument(int number) throws MyException {
        Instrument instrument;
        switch (number){
            case 1:
                instrument = new Piano("Steinway & Sons", 75000,"white");
                break;
            case 2:
                instrument = new Synthesizer("Yamaha", 4755, true);
                break;
            case 3:
                instrument  = new Guitar("Hohner", 490, "Acoustic");
                break;
            case 4:
                instrument = new Violin("Cremona", 1750);
                break;
            case 5:
                instrument = new Saxophone("Buffet Crampon", 5600);
                break;
            case 6:
                instrument = new Flute("Roosen", 2145);
                break;
            default:
//                System.out.println("Wrong number");
//                instrument = null;
                throw new MyException("Exception: Wrong number");
        }
        return instrument;

    }
}
