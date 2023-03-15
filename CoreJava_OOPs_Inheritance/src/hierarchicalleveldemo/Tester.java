package hierarchicalleveldemo;

public class Tester extends Employee
{

	 String workType;

	public Tester(int empId, String empName, String empAddress, String empMob, float empSal, String workType ) 
	{
		super(empId, empName, empAddress, empMob, empSal);
		
		this.workType=workType;
		
	}
	
	void display()
	{  
		super.display();
		System.out.println("\tWork Type       : "+workType);
	}
	
	
	

}
