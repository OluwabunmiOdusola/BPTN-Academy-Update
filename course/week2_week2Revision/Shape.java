package com.bptn.course.week2_week2Revision;

public class Shape {

	    void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Rectangle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing a rectangle");
	    }
	}

	class Circle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

