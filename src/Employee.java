import java.util.Scanner;

class Employee {
	
	//Declaring all the attributes
	private String name;
	private int employeeId;
	private double salary;
	private String payRate;
	private String joinDate;
	private String typeOfEmployee;
	//This is hours per week
	private int hours;
	private String ssn;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Constructors
	Employee(String name, double salary, String payRate, String joinDate, String typeOfEmployee) {
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
	}
	
	Employee(String name, double salary, String payRate, String joinDate, String typeOfEmployee, int employeeId, int hours) {
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
		this.employeeId = employeeId;
	}
	
	//TODO: toString() method
	
	//compareSalary Method: compares the salary of current object with that of the object sent to it
	void compareSalary(Employee another) {
		//tom.compareSalary(ron);
		if(this.salary > another.salary) {
			System.out.println(this.name + " has higher salary than " + another.name);
		}
	}
	
	boolean isSalaryHigher(Employee that) {
		if(this.salary > that.salary) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}