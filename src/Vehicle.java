 /*Create a vehicle class - you can google for it's attributes and behaviors
 * Create at least 2 instance methods
 * Create main function inside the same class
 * Create 5 vehicle objects 
 * Create at least 3 constructors including a default constructor that doesn't do anything(meaning, the 
 * default constructor sets everything to null*/
 
 
public class Vehicle {
	public static void main(String args[]){
		System.out.println();
	}
	String make;
	int model;
	String color;
	int doors;
	int mileage;

Vehicle (){
}

Vehicle (String make, int model, String color, int doors, int mileage){
	this.make = make;
	this.model =  model;
	this.color = color;
	this.doors = doors;
	this.mileage = mileage;
}	
Vehicle (String make, int model, String color,int mileage){
		this.make = make;
		this.model =  model;
		this.color = color;
		this.mileage = mileage;
	
}


Void calculateRun(){
	int calculateRun;
	Run = make * mileage;
	System.out.println("The vehicle runs per milege" + Run);
	
	
}
}
