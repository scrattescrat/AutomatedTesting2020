package com.music.main;

import com.music.instrument.*;

import java.sql.SQLOutput;

public class Executor {
    public static void main(String[] args){

        System.out.println("---Synthesizer---");
        Synthesizer synthesizer = new Synthesizer();
        synthesizer.printFields();
        synthesizer.setElectronic(true);
        synthesizer.printElectronic();

        Synthesizer synthesizer1 = new Synthesizer(true);
        synthesizer1.printElectronic();

        System.out.println("---Synthesizer---");
        Synthesizer synthesizer3 = new Synthesizer(true);
        synthesizer3.printElectronic();
        synthesizer3.setManufacturer("Yamaha");
        synthesizer3.setPrice(4755);
        synthesizer3.printFields();

        System.out.println("---Piano---");
        Piano piano1 = new Piano("white");
        piano1.setManufacturer("Steinway & Sons");
        piano1.setPrice(75000);
        piano1.printFields();
        piano1.printColour();

        System.out.println("---Guitar---");
        Guitar guitar1 = new Guitar ("acoustic");
        guitar1.setManufacturer("Hohner");
        guitar1.setPrice(490);
        guitar1.printGuitarType();
        guitar1.printFields();

        System.out.println("---Violin---");
        Violin violin1 = new Violin();
        violin1.setManufacturer("Cremona");
        violin1.setPrice(1750);
        violin1.printFields();

        System.out.println("---Flute---");
        Flute flute1 = new Flute();
        flute1.setFluteType("side-blown");
        flute1.setManufacturer("Roosen");
        flute1.setPrice(2145);
        flute1.printFluteType();
        flute1.printFields();

        System.out.println("---Saxophone---");
        Saxophone saxophone1 = new Saxophone();
        saxophone1.setManufacturer("Buffet Crampon");
        saxophone1.setPrice(5600);
        saxophone1.printFields();



    }
}
