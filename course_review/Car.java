package com.bptn.course_review;

public class Car {
	    String color;
	    String brand;
	    int price;


	    public Car() {
	        // calls the parameterized constructor
//	        this.color = "Purple";
	        this("Purple", "ToyotaCorolla", 50000);
	    }

	    public Car(String color, String brand, int price) {
	        this.color = color;
	        this.brand = brand;
	        this.price = price;
	    }

	    void printCarDetails() {
	        this.print();
	    }

	    private void print() {
	        System.out.println( "Car{color='" + color + ", brand=" + brand + ", price=" + price + "}" );
	    }
	    
	    public static void main(String[] args) {
			Car defaultCar = new Car();
	        defaultCar.printCarDetails();
		}
	}



