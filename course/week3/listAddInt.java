package com.bptn.course.week3;
import java.util.*;
public class listAddInt {

	 public static void main(String[] arts) {
	      ArrayList<Integer> list1 = new ArrayList<Integer>();
	      list1.add(1);
	      System.out.println(list1);
	      // adds the number 2 to the end of the list
	      list1.add(2);
	      System.out.println(list1);
	      // This will add the number 3 at index 1
	      list1.add(1, 3);
	      System.out.println(list1);
	      // This will add the number 4 at index 1
	      list1.add(1, 4);
	      System.out.println(list1);
	      System.out.println("The size of the ArrayList is " + list1.size());
	   }
	
}
