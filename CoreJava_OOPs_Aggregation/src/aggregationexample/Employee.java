package aggregationexample;

class Address
{
	int houseNo;
	String block;
	String city;
	int pin;
	
	Address(int houseNo,String block, String city,int pin)
	{
		this.houseNo=houseNo;
		this.block=block;
		this.city=city;
		this.pin=pin;
		
	}
	
	
}



public class Employee {
	
	int empId;
	String empName;
	float empSal;
	Address add;
	
	Employee(int empId,String empName,float empSal, Address add)
	{
		 this.empId=empId;
		 this.empName=empName;
		 this.empSal=empSal;
		 this.add=add;
	}
	
	void displayInfo()
	{
		System.out.println("\t*************************************");
		System.out.println("\t\tEmployee Information");
		System.out.println("\t*************************************");
		System.out.println("\tEmployee Id     : "+empId);
		System.out.println("\tEmployee Name   : "+empName);
		System.out.println("\tEmployee Salary : "+empSal);
		System.out.println("\tEmployee Address: ");
		
	}
	
	void display()
	{
		System.out.println("\t\t\t House No: "+add.houseNo);
		System.out.println("\t\t\t Block No: "+add.block);
		System.out.println("\t\t\t City    : "+add.city);
		System.out.println("\t\t\t Pincode : "+add.pin);
		System.out.println("\t*************************************");
		
	}
	

	public static void main(String[] args) {
		Address add1=new Address(111, "block-A","Pune", 101122);
	
           Employee emp=new Employee(101,"Mahesh",40000.00f,add1);
               emp.displayInfo();
               emp.display();
               
	}

}
