package com.assignment4.group24;

import java.util.Date;

public class Schedule {
	public static Connection getConnection(Date date, Terminal origin, Terminal dest) {
		// stub: check if there is a train for this date, origin and destination
		return new Connection(date, origin, dest);
	}
}
