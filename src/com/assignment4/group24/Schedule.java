package com.assignment4.group24;

import java.util.Date;

public class Schedule {
	
	// step 1.1 of the diagram
	public static Connection getConnection(Date date, String origin, String dest) {
		// step 1.2 of the diagram
		// stub: check if there is connection available for these places and in this date
		return new Connection(date, origin, dest);
	}
}
