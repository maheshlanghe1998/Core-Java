package assignment.day12.employeeloaneligibilty;

public class PermanentEmployee extends Employee 
{   
	private double basicPay;
    double pfAmount=(basicPay*0.12);
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		
	}

	@Override
	public void calculateSalary() {
		
		 salary = basicPay - pfAmount;
         System.out.println("The Salary Of Permanent Employee: "+salary);		
	}

	
}
