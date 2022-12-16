package com.assignment4.group24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		try {
			// creating basic information needed to issue a booking and ticket
			// in a real web system these would be provided by the user via front-end and then sent to back-end
			Passenger passenger = new Passenger("John Doe", 26);
			String origin = "Montreal Gare Centrale";
			String destination = "Toronto Union Station";

			// trip date and time
			String date_string = "26-01-2023 14:55";
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			Date date = formatter.parse(date_string);
			
			// place booking, step 1 of the diagram 
			Terminal terminal = new Terminal("Terminal 123 at Montreal Gare Central");
			Ticket ticket = terminal.makeBooking(passenger, date, origin, destination);
			ticket.printInformation();
		} catch (ParseException ex) {
			System.out.println("An error occured: " + ex.getMessage());
		}
	}
}
