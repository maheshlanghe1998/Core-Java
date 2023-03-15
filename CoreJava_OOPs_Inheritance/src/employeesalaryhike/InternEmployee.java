package employeesalaryhike;

public class InternEmployee extends Employee
{
	void incrementDisplay()
	  {
		  float hike=0.25f;
		  
		  salary=salary+(salary*hike);
		
		  System.out.println("The salary is: "+salary);
	  }
}
