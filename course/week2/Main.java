package com.bptn.course.week2;

public class Main {
	public void Method1() {
		int arr [] = {1, 2, 3, 4};
			System.out.println(arr [4]);
	}
	public void Method2() {
	try {
		this.Method1();
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Method2: ArrayIndexOutOfBoundException handled");
	}
			
				
				
		}
	//public static void main(String[] args) {

	

}
