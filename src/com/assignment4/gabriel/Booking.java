package com.assignment4.gabriel;

import java.util.UUID;

public class Booking {
	UUID id;
    Passenger pass;
    Connection conn;

    public Booking(Passenger pass) {
    	this.id = UUID.randomUUID();
        this.pass = pass;
    }

    public Boolean save() {
        // STUB: persist on the database
        return true;
    }

    public Boolean makeNewBooking(Connection conn) { 
        this.conn = conn;
        System.out.println("booking saved: " + conn.getName());
        return this.save();
    }

}
