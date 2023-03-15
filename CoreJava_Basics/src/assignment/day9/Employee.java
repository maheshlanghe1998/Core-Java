package assignment.day9;

public class Employee {
       
	static String company;
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
	 
	 static String company()
	 {
		company= "Amdocs Development Center LLP, Gurgaon";
		return company;
		 
	 }
	
	public static void main(String[] args) 
	
    {   
		System.out.println("********************************************************");  
		System.out.println("\t"+Employee.company());
		System.out.println("********************************************************");
    
		Employee emp = new Employee(194891, "Mahesh Langhe", "Pune(Maharashtra)","+91-7038531656", 46175.00f);
		emp.display();
		
		 System.out.println("*******************************************************");
		
	
	}

}
