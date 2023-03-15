package assignment.day10.student;

public class Student 
{
	int studId;
	String studName;
	double examFee;
	
	public Student(int studId, String studName, double examFee) {
		
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}

	
	 double payFee()
	 { 
		 return examFee;
		 
	 }
	
	void displayDetails()
	{
		System.out.println("Student Id: "+studId);
		System.out.println("Student Name: "+studName);
	}

}
