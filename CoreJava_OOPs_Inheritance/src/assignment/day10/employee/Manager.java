package assignment.day10.employee;

public class Manager extends Employee
{
	String type;
	
    public Manager(String name, int empId, float salary,String type) {
		super(name, empId, salary);
		this.type=type;
		
	}
  void setSalary()
  {
	  System.out.println("Employee salary: "+salary);
  }
	
    
}
