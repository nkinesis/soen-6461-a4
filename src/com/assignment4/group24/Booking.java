package com.assignment4.group24;

import java.util.UUID;

public class Booking {
	UUID id;
    Passenger passenger;
    Connection conn;
    Ticket ticket;

    public Booking() {
    	this.id = UUID.randomUUID();
    }

    public Boolean save() {
        // stub: persist on the database
        System.out.println("Booking saved!");
        return true;
    }

    // step 3 of the diagram
    public Ticket makeNewBooking(Passenger passenger, Connection conn) { 
        this.conn = conn;
        this.passenger = passenger;
        return getTicket();
    }

    // the booking can exist without a ticket, but the ticket can't exist without a booking
    public Ticket getTicket() {
        if (this.ticket == null) {
            this.ticket = new Ticket(this);
        }
        this.save();
        // if a ticket has already been issued, return it
        return this.ticket;
    }
    
    public Passenger getPassenger() {
        return this.passenger;
    }
    
    public Connection getConnection() {
        return this.conn;
    }

}
