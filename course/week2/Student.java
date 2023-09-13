package com.bptn.course.week2;

public class Student extends Person {

	private int id;

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
	}

}
