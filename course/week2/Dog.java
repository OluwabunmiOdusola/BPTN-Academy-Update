package com.bptn.course.week2;

public class Dog extends Pet {
	public Dog(String name) {
	super(name, "Dog");
	}
    
    /*public String speak() {
        return "Woof!";
    }
	/*public Dog (String name, String type) {
        this.Name = name;
        this.Type = type;*/
	
    @Override
    public String speak() {
       return "Woof!";
   }
   


}


