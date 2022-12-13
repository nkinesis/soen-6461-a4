package com.assignment4.gabriel;

import java.util.UUID;

public class Passenger {
	UUID id;
	String name;
	int age;
	
	public Passenger(String name, int age) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return Integer.toString(this.age);
	}
}
