package com.music.main;

import com.music.event.Creator;
import com.music.event.Orhester;
import com.music.instrument.*;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {

        KeyboardInstrument piano = new Piano("Steinway & Sons", 75000,"white");
        KeyboardInstrument synthesizer = new Synthesizer("Yamaha", 4755, true);
        StringedInstrument guitar = new Guitar("Hohner", 490, "Acoustic");
        StringedInstrument violin = new Violin("Cremona", 1750);
        WindInstrument saxophone = new Saxophone("Buffet Crampon", 5600);
        WindInstrument flute = new Flute("Roosen", 2145);

        Orhester orhester = new Orhester();

        orhester.addWindInstrument(flute);
        orhester.addWindInstrument(flute);
        orhester.addWindInstrument(flute);
        orhester.addWindInstrument(saxophone);

        orhester.addKeyboardInstrument(piano);
        orhester.addKeyboardInstrument(piano);
        orhester.addKeyboardInstrument(synthesizer);

        orhester.addUniqueInstrument(violin);
        orhester.addUniqueInstrument(violin);
        orhester.addUniqueInstrument(guitar);

        orhester.printInfo();

        System.out.println("Enter number from 1 to 6");
        Scanner scan1 = new Scanner(System.in);
        int number = scan1.nextInt();

        Creator creator = new Creator();
        Instrument instrument = creator.createInstrument(number);

        System.out.println("*****");
        System.out.println("Do you want add the Instrument to UniqueStorage? Y/N");
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.nextLine();
        if (answer.equals("Y")) {
           orhester.addUniqueInstrument(instrument);
        }
        System.out.println("new UniqueStorage size: " + orhester.getUniqueStorage().size());

        System.out.println("Enter number of JazzInstrument to delete from 0 to "
                + (orhester.getJazzMelody().size()-1));
        int numToDelete = scan1.nextInt();
        if (numToDelete >= 0 && numToDelete <= orhester.getJazzMelody().size() - 1) {
            orhester.deleteWindInstrument(numToDelete);
        }
        System.out.println("new size: " + orhester.getJazzMelody().size());
        orhester.printInfo();



    }

}
