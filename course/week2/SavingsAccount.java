package com.bptn.course.week2;

public class SavingsAccount extends Account {
	   private double interest;
	    public SavingsAccount(String name, double balance, double interest) {
	        super(name, balance);
	        this.interest = interest;
	    }
	        @Override
	    public String toString(){
	        return super.toString() + ", " + interest;
	    }
	    @Override
	    public boolean equals(Object other) {
	        // Type cast other to a Person
	        SavingsAccount otherSAccount= (SavingsAccount) other;
	        // Check if names are equal
	        return (super.equals(other) && (this.interest == otherSAccount.interest));
	    }
	

	
	/*private int interest;
	public SavingsAccount(String name, double balance, int interest) {
		super(name, balance);
		this.interest = interest;
	}
	
	public String toString() {
		return super.toString() + ", " + this.interest;
	
	}
	
	return super.equals(otherObj) &&
		       (this.interest == otherObj.interest);*/
	

}    