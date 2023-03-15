package assignment.day10.employee;

public class Employee 
{
	String name;
	int empId;
	float salary;

	public Employee(String name, int empId, float salary)
	{

		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary) 
	{
		this.salary = salary;
	}

	 void Employeedetails()
	    {
	    	System.out.println("The Employee Name: "+name);
	    	System.out.println("The Employee Id: "+empId);
	    	
	    }
}
