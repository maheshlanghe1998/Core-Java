package assignment.day12.employeeloaneligibilty;

public class TemporaryEmployee extends Employee
{   
	int  hoursWorked;

    int hourlyWages;
    
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
	}
	
	

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}



	@Override
	public void calculateSalary() {
		
		salary = hoursWorked * hourlyWages;
		System.out.println("The Salary Of Temparary Employee: "+salary);
	}

	
}
