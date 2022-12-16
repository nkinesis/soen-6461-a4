package com.assignment4.group24;

import java.util.Date;
import java.util.UUID;

public class Terminal {
	UUID id;
	String name;
	
	public Terminal(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}
	
	// step 1 of the diagram
	public Ticket makeBooking(Passenger passenger, Date date, String origin, String destination) {
		Connection connection = Schedule.getConnection(date, origin, destination);
		RailCompany company = new RailCompany("CanadaExample Rail Co.");
		Ticket ticket = company.issueBooking(passenger, connection);
		return ticket;
	}
	
	public String getName() {
		return this.name;
	}
}
