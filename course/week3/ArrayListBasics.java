package com.bptn.course.week3;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		// DECLARE, INITIALIZE, SIZE, and PRINT
	       ArrayList<String> nameList = null; /* Declare */
	       System.out.println(nameList);

	       nameList = new ArrayList<String>(); /* Allocate memory*/
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());
	       
	       // ADD w/o index
	       nameList.add("Esther");
	       System.out.println(nameList);
	       nameList.add("Deborah");
	       System.out.println(nameList);
	       nameList.add("Jeremiah");
	       System.out.println(nameList);
	       nameList.add("Raphel");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());
	 
	       // ADD w/ index
	       nameList.add(3, "Daniel");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());

	       // GET
	       System.out.println("name at index 2 is " + nameList.get(2));

	       // SET
	       nameList.set(1, "Emmanuel");
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());

	       // REMOVE
	       nameList.remove(4);
	       System.out.println(nameList);
	       System.out.println("size is " + nameList.size());

	}

}
