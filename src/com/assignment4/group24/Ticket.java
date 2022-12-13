package com.assignment4.group24;

import java.util.UUID;

public class Ticket {
	UUID id;
	
	public Ticket() {	
		this.id = UUID.randomUUID();
	}
	
	public String getId() {
		// e.g. this could be in a QR code which is scanned at the station before you board
		return this.id.toString();
	}
}
