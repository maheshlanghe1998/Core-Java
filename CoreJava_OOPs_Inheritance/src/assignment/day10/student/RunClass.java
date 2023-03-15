package assignment.day10.student;

public class RunClass {

	public static void main(String[] args) 
	{
		DayScholar d=new DayScholar(10, "Mahesh", 10000.00, 20000.00);
		d.displayDetails();
		d.payFee();
		System.out.println("****************************");
		
		Hosteller h=new Hosteller(20,"Shubham",10000.00,50000.00);
		h.displayDetails();
		h.payFee();
	}

}
