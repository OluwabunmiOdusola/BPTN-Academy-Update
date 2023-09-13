package com.bptn.course.week3;
import java.util.*;
public class listGetSet {

	public static void main(String[] args) {
		 ArrayList<String> nameList = new ArrayList<>();
	      nameList.add("Diego");
	      nameList.add("Grace");
	      nameList.add("Deja");
	      System.out.println(nameList);
	      System.out.println(nameList.get(0));
	      System.out.println(nameList.get(1));
	      nameList.set(1, "John");
	      System.out.println(nameList);
	}

}
