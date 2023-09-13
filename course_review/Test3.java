package com.bptn.course_review;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        for (int i = 0; i < nums.length; i ++) {
            //for(Integer element: values) {
                //System.out.println(element + " ");
                values.add(nums[i]);
                //System.out.printf(values + "")
            
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
	}

}
