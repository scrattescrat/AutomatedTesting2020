package com.music.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrittingToFile {
    public static void writeToFile() {
        File file = new File("text");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        pw.println("Orhester1: guitar, violin, flute, flute");
        pw.println("Orhester2: Saxophone, flute, piano");

        pw.close();





    }
}
