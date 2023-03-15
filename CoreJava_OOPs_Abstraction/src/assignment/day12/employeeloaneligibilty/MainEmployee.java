package assignment.day12.employeeloaneligibilty;

public class MainEmployee {

	public static void main(String[] args) {
		
		PermanentEmployee pe=new PermanentEmployee(101, "mahesh", 50000.0); 
		pe.calculateSalary();
		
		TemporaryEmployee ee=new TemporaryEmployee(102,"Sid",180,25);
		ee.calculateSalary();
        
		Loan l= new Loan();
		System.out.println("The Loan Amount for Permanent Employee: "+l.calculateLoanAmount(pe));
		System.out.println("The Loan Amount for Temporary Employee: "+l.calculateLoanAmount(ee));
	}

}
