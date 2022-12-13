package com.assignment4.group24;

import java.util.UUID;

public class Booking {
	UUID id;
    Passenger pass;
    Connection conn;
    Ticket ticket;

    public Booking(Passenger pass) {
    	this.id = UUID.randomUUID();
        this.pass = pass;
    }

    public Boolean save() {
        // stub: persist on the database
        return true;
    }

    public Boolean makeNewBooking(Connection conn) { 
        this.conn = conn;
        System.out.println("booking saved: " + conn.getName());
        return this.save();
    }

    // usually when you book a train trip, the ticket is not issued right away
    // the booking can exist without a ticket, but the ticket can't exist without a booking
    public Ticket getTicket() {
        if (this.ticket == null) {
            this.ticket = new Ticket();
        }
        this.save();
        return this.ticket;
    }

}
