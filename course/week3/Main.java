package com.bptn.course.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List<Integer> grades = new ArrayList<Integer>();
		List<Integer> grades = new ArrayList<>(Arrays.asList(1, 2, 3)); 
        
        System.out.printf("The size of the array is %d", grades.size());
	}

}
