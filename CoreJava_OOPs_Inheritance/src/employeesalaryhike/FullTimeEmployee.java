package employeesalaryhike;

public class FullTimeEmployee extends Employee 
{
  void incrementDisplay()
  {
	  float hike=0.5f;
	  
	  salary=salary+(salary*hike);
	
	  System.out.println("The salary is: "+salary);
  }
}
