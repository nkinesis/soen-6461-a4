package com.assignment4.group24;

import java.util.Date;
import java.util.UUID;

public class RailCompany {
	UUID id;
	String name;
	
	public RailCompany(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}
	
    public Connection get(Date date, Terminal origin, Terminal dest) {
        // step 3 and 4 of the diagram
        return Schedule.getConnection(date, origin, dest);
    }

    // step 2 of the diagram
    public Boolean issueBooking(Passenger pass, Date date, Terminal origin, Terminal dest) {
        Connection conn = this.get(date, origin, dest);
        // if a connection is available, issue the booking
        if (conn != null) {
        	System.out.println("issue booking for " + pass.getName() + ", " + pass.getAge() + " yo");
            Booking book = new Booking(pass);
            return book.makeNewBooking(conn);
        }
        return false;
    }
    
	public String getName() {
		return this.name;
	}
}
