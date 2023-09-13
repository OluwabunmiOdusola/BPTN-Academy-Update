package com.bptn.course_review;

import java.util.ArrayList;

public class Test4 {

	public static int sumNegValues(ArrayList<Integer> list) {
		int sum = 0;
		for (Integer element : list) {
			if (element < 0) {
				sum += element;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { -2, 34, -11, 9, -6, 3 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		System.out.println("Expected Result:\t -19");
		System.out.print("Your Result:\t\t ");
		System.out.println(sumNegValues(values));
	}

}
