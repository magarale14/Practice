
public class Em {
	public static String NAME = "Sam";

	private String name;
	private String title;
	private int salary;
	private double payRate;
	private int hours;
	
	Em(){
	}
	Em(String name,String title,int salary,double payRate,int hours){
		this.name=name;
		this.title=title;
		this.salary=salary;
		this.payRate=payRate;
		this.hours=hours;
		
	}
	Em(String name,String title,int salary,double payRate){
		this.name=name;
		this.title=title;
		this.salary=salary;
		this.payRate=payRate;
	}

	public String toString(){
		return ("Name: "+ this.name + "\n" + "title : " + this.title + "\n" + "salary : " + this.salary + "\n" + "payRate: " + this.payRate + "\n");

		
		
			}
		}
		
		

