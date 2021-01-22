package com.music.menu;

import com.music.utils.WRFromProperty;

public class Ticket {
    public static void getTicket() {

        String getProperty1 = WRFromProperty.getProperty("info.properties", "date");
        String getProperty2 = WRFromProperty.getProperty("info.properties", "time");
        String getProperty3 = WRFromProperty.getProperty("info.properties", "status");
        System.out.println(getProperty1);
        System.out.println(getProperty2);
        System.out.println(getProperty3);


    }

    public static void returnTicket(){
        WRFromProperty wrFromProperty = new WRFromProperty();
        wrFromProperty.writeProperty("info.properties", "status", "returned");
    }



}

