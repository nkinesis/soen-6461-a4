package com.assignment4.group24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		try {
			// creating basic information needed to issue a booking and ticket
			// in a real web system these would be provided by the user via front-end and then sent to back-end
			RailCompany company = new RailCompany("Example Rail Co.");
			Passenger pass = new Passenger("John Doe", 26);
			Terminal origin = new Terminal("Montreal Gare Central");
			Terminal dest = new Terminal("Toronto Union Station");

			// trip date and time
			String date_string = "26-01-2023 14:55";
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			Date date = formatter.parse(date_string);
			
			// place booking on the origin terminal, 
			// this is where the passenger will board and therefore where the ticket will be checked
			origin.makeBooking(company, pass, date, dest);
		} catch (ParseException ex) {
			System.out.println("An error occured: " + ex.getMessage());
		}
	}
}
