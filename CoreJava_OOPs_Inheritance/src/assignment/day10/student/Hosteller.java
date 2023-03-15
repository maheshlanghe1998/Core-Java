package assignment.day10.student;

public class Hosteller extends Student
{
	double hostelFee;
	
	public Hosteller(int studId, String studName, double examFee, double hostelFee) 
	{
		super(studId, studName, examFee);
		
		this.hostelFee=hostelFee;
	
	}
	
	double payFee()
	   {
		double paidFee= 40000;
		   double totalFee=examFee+hostelFee;
		   System.out.println("Total fees to paid: "+totalFee); 
		   System.out.println("Paid Fees: "+paidFee);
		   double remainFee=totalFee-paidFee;
		   System.out.println("Fees Remains to pay: "+remainFee);
		   return remainFee;
		   
		   
	   }

}
