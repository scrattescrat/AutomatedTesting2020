package com.music.main;

import com.music.event.Creator;
import com.music.event.MyException;
import com.music.event.Orhester;
import com.music.instrument.*;
import com.music.menu.Menu;
import com.music.menu.OrchesterComposition;
import com.music.utils.ReadingFromFile;
import com.music.utils.WRFromProperty;
import com.music.utils.WrittingToFile;
import jdk.jshell.execution.Util;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) throws MyException {
        Menu menu = new Menu();
        menu.menuSelection();

    }

}
