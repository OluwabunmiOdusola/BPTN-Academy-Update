package com.bptn.course.array;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//write your code below:
        System.out.println("/................Calculator Menu................/ ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt() ;

        double num1, num, answer = 0 ;

 //the addition of the number
        if ( input == 1){
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num = sc.nextDouble();

            answer = num1 + num;
            System.out.println("The sum of the numbers " + num1 + " and " +  num  + " is = " + answer);
        
 //the subtraction of the number
        
        } else if (answer ==2 ) {
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num = sc.nextDouble();

            answer = num1 - num;
            System.out.println("The difference of the numbers " + num1 + " and " + num + " is = " + answer);
        
 //the multiplication of the number
        } else if (answer == 3) {

            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num = sc.nextDouble();

            answer = num1 * num;
            System.out.println("The product of the numbers " + num1 + " and " + num + " is = " + answer);
       
//the division of the numbers
        } else if (answer == 4) {

            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            num = sc.nextDouble();
            answer = num1 / num;
            System.out.println("The divison of the numbers " + num1 + " and " + num + " is = " + answer);
       
//the square of the number
        } else if (answer == 5) {

            System.out.print("Enter the number to find square: ");
            num1 = sc.nextDouble();
            answer = num1 * num1;
            System.out.println("The Square of the number" +  num1 + " is = " + answer);
            
//the square root
        } else if (answer == 6){
                System.out.print("Enter the number to find square root: ");
                num1 = sc.nextDouble();
                answer = Math.sqrt(num1);
                System.out.println("The Square of the number" +  num1 + " is = " + answer);
            } else if(answer == 7){
                System.out.print("Enter the number to find Reciprocal: ");
                num1 = sc.nextDouble();
                answer = 1/ num1;
                System.out.println("The Reciprocal of the number" +  num1 + " is = " + answer);
            }
            else {
                System.out.println("Invalid choice");
            }
        sc.close();
        }
    }


