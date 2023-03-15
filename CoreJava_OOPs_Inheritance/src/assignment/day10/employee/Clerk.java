package assignment.day10.employee;

public class Clerk extends Employee
{     
	int speed;
    int accuracy;
	
    public Clerk(String name, int empId, float salary,int speed,int accuracy) 
    {
		super(name, empId, salary);
		this.speed=speed;
		this.accuracy=accuracy;
	
	}

    void setSalary()
    {
    	 System.out.println("Employee salary: "+salary);
    }
    
   
}
