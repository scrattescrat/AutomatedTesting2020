package com.music.menu;

import com.music.event.MyException;
import com.music.instrument.Instrument;

public class Menu {
    public void menuSelection() throws MyException {
        System.out.println("----- Welcome to the Theatre -----\nPlease, choose the action:");
        System.out.println("Press 1 - See the concert schedule for the month.\nPress 2 - Book a ticket.\nPress 3 - Return a ticket");
        System.out.println("Please, make your choice");

        try {

        int selection = InputValue.inputVaue();
        switch (selection){
            case 1:
                OrchesterComposition.createOrchester();
                break;
            case 2:
                Ticket.getTicket();
                break;
            case 3:
                Ticket.returnTicket();
                break;
            default:
                throw new MyException("Wrong number");
                        }
        }catch (MyException e){
            System.err.println("Wrong value: " + e.getMessage());
        }



    }
}
