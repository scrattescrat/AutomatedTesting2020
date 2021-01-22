package com.music.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;


public class ReadingFromFile {

    public static void readFromFile() {

        String separator = File.separator;
        String path = separator + "home" + separator + "tanya" + separator + "Desktop" + separator + "info";
        File file = new File(path);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
//
        scanner.close();



    }

}
