package com.bptn.course.week2_week2Revision;

interface Shape2 {
	    
	    public void draw();
	}

	class Triangle implements Shape2 {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a Triangle");
	    }
	}

	class Square implements Shape2 {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a square");
	    }
	}
	
