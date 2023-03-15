package assignment.day11.company;

public class Trainee extends Employee

{
	
		public Trainee(float basicSal) {
		super(basicSal);
		
	}

		float employeeSalary()
		{
			 return basicSal+(0.10f * basicSal);
		}


}
