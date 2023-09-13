package com.bptn.course_review;

public class MyThread extends Thread {

	    int limitToStop;

	    // Create a constructor to initialize the above instance 
	    MyThread(int limitToStop){
	    this.limitToStop = limitToStop;
	    }

	    // Override the run() method here.
	    //@override
	    public void run() {
	        for(int i = 0; i <= limitToStop; i++) {
	            if(i % 2 == 1) {
	            System.out.println(i);
	        
	        try{
	            Thread.sleep(1000);
	        } 
	        catch(InterruptedException e){
	            e.printStackTrace();
	        }
	            }
	            
	    }
	}
	}

