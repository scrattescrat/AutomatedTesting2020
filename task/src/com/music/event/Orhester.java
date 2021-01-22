package com.music.event;

import com.music.instrument.*;

import java.util.*;

public class Orhester {

    List<WindInstrument> jazzMelody;
    List<KeyboardInstrument> band;
    Set<Instrument> uniqueStorage;

    public int size = 12;

    public Orhester(){
        jazzMelody = new ArrayList<WindInstrument>();
        band = new LinkedList<KeyboardInstrument>();
        uniqueStorage = new HashSet<Instrument>();
    }

    public Orhester(KeyboardInstrument keyboardInstrument, Instrument instrument){
        jazzMelody = new ArrayList<WindInstrument>();
        band = new LinkedList<KeyboardInstrument>();
        size ++;
    }

    public Set<Instrument> getUniqueStorage() {
        return uniqueStorage;
    }

    public List<WindInstrument> getJazzMelody() {
        return jazzMelody;
    }

    public void addWindInstrument(WindInstrument instrument) {
        jazzMelody.add(instrument);
    }

    public void addKeyboardInstrument(KeyboardInstrument keyboardInstrument) {
        band.add(keyboardInstrument);
    }

    public void addUniqueInstrument(Instrument instrument) {
        System.out.println("addUniqueInstrument");
        uniqueStorage.add(instrument);
    }

    public void deleteWindInstrument(WindInstrument instrument) {
        jazzMelody.remove(instrument);
    }

    public void deleteWindInstrument(int num) {
        jazzMelody.remove(num);
    }

    public void deleteKeyboardInstrument(KeyboardInstrument keyboardInstrument) {
        band.remove(keyboardInstrument);
    }



    public void printInfo() {
//        System.out.println("=====Instrument=====");
//
//        for (WindInstrument jazzInstrument : jazzMelody) {
//            System.out.println(jazzInstrument.toString());
//        }

        System.out.println("=====BAND=====");

        for (Object keyboardInstrument : band) {
            System.out.println(keyboardInstrument.toString());
        }

//        System.out.println("=====Unique Instrument=====");
//
//        for (Instrument instrument : uniqueStorage) {
//
//            try {
//                System.out.println(instrument.toString());
//            } catch (NullPointerException e) {
//                e.printStackTrace();
//            }
//        }
    }

}


