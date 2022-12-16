package com.assignment4.group24;

import java.util.UUID;

public class RailCompany {
	UUID id;
	String name;
	
	public RailCompany(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}

    // step 2 of the diagram
    public Ticket issueBooking(Passenger passenger, Connection connection) {
        // if a connection is available, issue the booking
        if (connection != null) {
        	System.out.println("Issuing booking for " + passenger.getName() + ", " + passenger.getAge() + " yo");
            Booking booking = new Booking();
            return booking.makeNewBooking(passenger, connection);
        }
        return null;
    }
    
	public String getName() {
		return this.name;
	}
}
