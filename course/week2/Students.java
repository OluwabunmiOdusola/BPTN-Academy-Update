package com.bptn.course.week2;

public class Students {
	    // Declare the variables (instance and static)
	    String name;
	    int grade;
	    String studentID;
	    private static String principalName = "Ms. McKoy";
	    private static int nextID = 100;
	    public Students(String name, int grade){
	        this.name = name;
	        this.grade = grade;
	        studentID = String.valueOf(name.charAt(0)).toUpperCase() + nextID ;
	        nextID++;
	    }
	    static void newPrincipal(String principalName){
	        Students.principalName = principalName;
	    }
	    private static void resetID() {
	        nextID = 100;
	    }
	    @Override
	    public String toString(){
	        return name + " " + studentID;
	    }
	    
	    // Do not modify the code below:
	    public static void main(String[] args) {
	        Students s1 = new Students("Muhammed", 11);
	        Students s2 = new Students("Alan", 11);
	        Students s3 = new Students("Sophie", 11);

	        System.out.println("Principal Name for student 1: " + Students.principalName);
	        System.out.println("Student ID for student 1: " + s1.studentID);
	        System.out.println("Student ID for student 2: " + s2.studentID);
	        System.out.println("Student ID for student 3: " + s3.studentID);

	        Students.newPrincipal("Mr. McKoy");
	        System.out.println("New principal name: " + Students.principalName);

	        Students.resetID();
	        Students s4 = new Students("kevin", 11);
	        System.out.println("Student ID for student 4: " + s4.studentID);
	        System.out.println("String representation of student 4: " + s4.toString());
	    }
	    
	

	}

