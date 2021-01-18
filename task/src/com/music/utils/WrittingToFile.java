package com.music.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrittingToFile {
    public static void writeToFile() throws FileNotFoundException {
        File file = new File("text");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Orhester1: guitar, violin, flute");
        pw.println("Orhester2: Saxophone, flute, piano");

        pw.close();





    }
}
