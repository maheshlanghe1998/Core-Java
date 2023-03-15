package assignment.day12.employeeloaneligibilty;



public class Loan
{
	
	static double loanAmount;
 
	
	public double calculateLoanAmount(Employee employeeObj)
	
	{
		if(employeeObj instanceof PermanentEmployee)
			return (loanAmount=0.15*(employeeObj.salary));
		
		
		else if(employeeObj instanceof TemporaryEmployee)
			return (loanAmount=0.10*(employeeObj.salary));
		
		else
		return 0;
		
	}

}
