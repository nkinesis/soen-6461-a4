package com.assignment4.gabriel;

import java.util.Date;
import java.util.UUID;

public class Terminal {
	UUID id;
	String name;
	
	public Terminal(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}
	
	public void makeBooking(RailCompany company, Passenger pass, Date date, Terminal dest) {
		System.out.println("make booking with " + company.getName());
		company.issueBooking(pass, date, this, dest);
	}
	
	public String getName() {
		return this.name;
	}
}
