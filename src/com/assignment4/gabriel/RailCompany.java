package com.assignment4.gabriel;

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
        return Schedule.getConnection(date, origin, dest);
    }

    public Boolean issueBooking(Passenger pass, Date date, Terminal origin, Terminal dest) {
        Connection conn = this.get(date, origin, dest);
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
