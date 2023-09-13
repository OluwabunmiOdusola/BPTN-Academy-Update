package com.bptn.course_review;

import java.util.ArrayList;

public class Test9 {
	public static String findLongest(ArrayList<String> list) {
        int longIndex = 0;
        for (int i = 0; i < list.size(); i++) {
                if(list.get(i).length() > list.get(longIndex).length())
                longIndex = i;
            }
        return list.get(longIndex);
    }
    //Do not modify below code
    public static void main(String[] args) {
        //instantiate ArrayList
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result: metropolitan");
        System.out.print("Your Result: ");
        System.out.println(findLongest(values));
    }
}

	


