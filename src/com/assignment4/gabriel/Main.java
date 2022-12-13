package com.assignment4.gabriel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		try {
			RailCompany company = new RailCompany("Example Rail Co.");
			Passenger pass = new Passenger("John Doe", 26);
			String date_string = "26-01-2023 14:55";
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			Date date = formatter.parse(date_string);
			Terminal origin = new Terminal("Montreal Gare Central");
			Terminal dest = new Terminal("Toronto Union Station");
			origin.makeBooking(company, pass, date, dest);
		} catch (ParseException ex) {
			System.out.println("An error occured: " + ex.getMessage());
		}
	}
}
