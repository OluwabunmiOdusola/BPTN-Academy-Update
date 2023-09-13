package com.bptn.course._jUnitBooks;

public class Book {
	private String title;
	private double price;
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
		
	}
	public String getTitle() {
		return title;
	}
	/*public void setTitle(String title) {
		this.title = title;
	}*/
	public String getBookInfo() {
		return this.title + "-" + this.price;
		
	}


}
