package hierarchicalleveldemo;

public class Employee 
{
	 int empId;
	 String empName;
	 String empAddress;
	 String empMob;
	 float empSal;
	 
	 
	 public Employee(int empId, String empName, String empAddress, String empMob, float empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empMob = empMob;
		this.empSal = empSal;
	}


	void display() 
	 
	 {
		 System.out.println("\temployee Id     : "+empId);
		 System.out.println("\temployee Name   : "+empName);
		 System.out.println("\temployee Address: "+empAddress);
		 System.out.println("\temployee Mob.No : "+empMob);
		 System.out.println("\temployee salary : "+empSal);
		 
	 }
}
