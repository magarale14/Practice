public class Payroll {
	
	static int someNumber;
	String payrollID;
	
	public static double calculatePay(Employee employee) {
		
		/*Pay cycle is bi-weekly. This function will be calculating an employee's paycheck for that cycle based on
		 * salary and payRate.  
		 */
		double salary;
		//If the employee has an yearly salary
		if(employee.getPayRate() == "YEARLY") {
			salary = (employee.getSalary()/52) * 2;
		}
		
		else if(employee.getPayRate() == "HOURLY") {
			salary = (employee.getSalary() * employee.getHours() * 2);
		}
		else {
			salary = 0.0;
		}
		
		return salary;
		
	}
	
	
}



