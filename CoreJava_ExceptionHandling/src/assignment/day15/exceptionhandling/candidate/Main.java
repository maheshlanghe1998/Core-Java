package assignment.day15.exceptionhandling.candidate;

import java.util.Scanner;

class InvalidSalaryException extends Exception 
{
	private static final long serialVersionUID = 2107770196153969886L;

	InvalidSalaryException(String str) 
	{
		super(str);

	}
}

public class Main 
{

	public static Candidate getCandidateDetails(Candidate objCandidatate) throws Exception
	{
       
		if (objCandidatate.getExpectedSalary() < 10000) 
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		    return null;

	}

	public static void main(String[] args)  throws Exception
	{
		Candidate objCandidatate = new Candidate();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Candidate deatails: ");
		System.out.println("Name");
		String name =sc.next();
		objCandidatate.setName(name);
		
		System.out.println("Gender");
		String gender =sc.next();
		objCandidatate.setGender(gender);
		
		System.out.println("Expected Salary");
		double sal= sc.nextDouble();
		objCandidatate.setExpectedSalary(sal);

		try {
			Main.getCandidateDetails(objCandidatate);
		} 
		catch (Exception e) {
			//e.printStackTrace();
			  System.out.println(e.getMessage());
		}

		if (objCandidatate.getExpectedSalary() > 10000) 
		{
			System.out.println("Registration Successful.");
		}

	}

}
