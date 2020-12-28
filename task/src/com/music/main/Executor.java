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

//        Orhester orhester1 = new Orhester(piano, flute, guitar);
//        Orhester orhester2 = new Orhester(synthesizer, saxophone, violin);
//
//        System.out.println("=== Orhester1 plays ===");
//        orhester1.playConcert();
//
//        System.out.println("=== Orhester2 plays ===");
//        orhester2.playConcert();


        System.out.println("=== Types ===");
        System.out.println(piano.TYPE);
        System.out.println(flute.TYPE);
        System.out.println(guitar.TYPE);
        piano.printManufacturer();
        flute.printManufacturer();
        guitar.printManufacturer();

        System.out.println("Enter number from 1 to 6");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Creator creator = new Creator();

        Instrument instrument = creator.createInstrument(number);
        if (instrument != null){
            instrument.printFields();
            instrument.play();
        }

    }

}
