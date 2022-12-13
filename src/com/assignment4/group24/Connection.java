package com.assignment4.group24;

import java.util.Date;
import java.util.UUID;

public class Connection {
	UUID id;
	Date date;
	Terminal origin;
	Terminal dest;
	
	public Connection(Date date, Terminal origin, Terminal dest) {
		this.id = UUID.randomUUID();
		this.date = date;
		this.origin = origin;
		this.dest = dest;
	}
	
	public String getName() {
		return "\nDeparting " + date + "\nFrom " + origin.getName() + " to " + this.dest.getName() + "\n=====\n";
	}
}
