package com.bptn.course_review;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        MyThread m = new MyThread(20);
        m.start();

    }

}

	
