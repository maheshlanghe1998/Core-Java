package hierarchicalleveldemo;

public class Developer extends Employee
{
	
	String workType;
	
	public Developer(int empId, String empName, String empAddress, String empMob, float empSal,String workType)
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
