package array.assignment.objectarray;

public class Employee 
{
   int emp_id;
   String emp_name;
   float salary;
   
public Employee(int emp_id, String emp_name,float salary) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.salary=salary;
	
}
  
public void display()
{
	System.out.println("Employee Id     : "+emp_id);
	System.out.println("Employee Name   : "+emp_name);
	System.out.println("Employee Salary : "+salary);
}
   
}
