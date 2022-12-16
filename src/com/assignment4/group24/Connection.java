package com.assignment4.group24;

import java.util.Date;
import java.util.UUID;

public class Connection {
	private UUID id;
	private Date date;
	private String origin;
	private String dest;
	
	// step 1.2 of the diagram
	public Connection(Date date, String origin, String dest) {
		this.id = UUID.randomUUID();
		this.date = date;
		this.origin = origin;
		this.dest = dest;
	}
	
	public String getID() {
		return this.id.toString();
	}
	
	public String getDate() {
		return this.date.toString();
	}
	
	public String getOrigin() {
		return this.origin;
	}
	
	public String getDestination() {
		return this.dest;
	}
}
