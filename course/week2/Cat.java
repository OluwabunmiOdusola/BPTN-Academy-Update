package com.bptn.course.week2;

public class Cat extends Pet {

	public Cat(String name) {
		super(name, "Cat");
		}
	    
	    /*public String speak() {
	        return "Woof!";
	    }
		/*public Dog (String name, String type) {
	        this.Name = name;
	        this.Type = type;*/
		
	    @Override
	    public String speak() {
	       return "Meow!";
	}

}
