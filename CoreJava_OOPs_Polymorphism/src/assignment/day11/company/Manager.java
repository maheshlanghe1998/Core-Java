package assignment.day11.company;

      public class Manager extends Employee
       {  
    	  
		
		public Manager(float basicSal) {
			super(basicSal);
			
		}

		float employeeSalary()
		{
			 return basicSal+(0.15f * basicSal);
		}

     }
