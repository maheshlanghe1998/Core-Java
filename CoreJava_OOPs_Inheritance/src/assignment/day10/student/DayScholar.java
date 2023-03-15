package assignment.day10.student;

public class DayScholar extends Student
{  
	double transportFee;
	
   public DayScholar(int studId, String studName, double examFee, double transportFee) 
   {
		super(studId, studName, examFee);
		
		this.transportFee =transportFee;
		
	}
   
   double payFee()
   {
	double paidFee= 10000;
	   double totalFee=examFee+transportFee;
	   System.out.println("Total fees to paid: "+totalFee); 
	   System.out.println("Paid Fees: "+paidFee);
	   double remainFee=totalFee-paidFee;
	   System.out.println("Fees Remains to pay: "+remainFee);
	   return remainFee;
	   
	   
   }
   
}
