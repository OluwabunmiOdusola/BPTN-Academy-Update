package com.bptn.course.week2;

public class ExceptionLearning {


	public static void main(String[] args) {

        try {
            int a = 11;
            int b = 0;
            System.out.println(a/b);
            //  Block of code to try
        } catch (Exception e) {
            System.out.println("The number cannot be divided by zero. Error: " + e);
            //  Block of code to handle errors
        }
    }

}
