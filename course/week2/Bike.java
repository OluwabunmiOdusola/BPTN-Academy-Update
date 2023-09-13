package com.bptn.course.week2;

public class Bike extends Vehicle {
	String bikeHandle;

	Bike(String colour, String brand, String bikeHandle){
		super(colour, brand);
		this.bikeHandle = bikeHandle;
	}

}
