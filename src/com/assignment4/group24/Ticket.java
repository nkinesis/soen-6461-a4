package com.assignment4.group24;

import java.util.UUID;

public class Ticket {
	UUID id;
	Booking booking;
	
	public Ticket(Booking booking) {	
		this.id = UUID.randomUUID();
		this.booking = booking;
	}

	public String getId() {
		// e.g. this could be in a QR code which is scanned at the station before you board
		return this.id.toString();
	}
	
	public void printInformation() {
		Connection conn = booking.getConnection();
		System.out.println("Ticket number " + this.id);
		System.out.println("For passenger " + booking.getPassenger().getName());
		System.out.println("Departure at " + conn.getDate());
		System.out.println("From " + conn.getOrigin());
		System.out.println("To " + conn.getDestination());
	}
}
