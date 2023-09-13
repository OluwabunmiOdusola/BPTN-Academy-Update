package com.bptn.course.week2;

public class Vehicle {
	String colour;
	String brand;
	
	Vehicle() {
        this("Black", "Tesla");

	}
	public Vehicle(String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
	}
	
	public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

    }

}