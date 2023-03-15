package assignment.day10.employee;

public class MyClass {

	public static void main(String[] args) {
		Manager emp1= new Manager("mahesh",101, 45000.00f, "Project Manager");
		emp1.Employeedetails();
		emp1.setSalary();
		
		System.out.println("*****************************");
		
		Clerk emp2= new Clerk("Siddhesh", 102, 50000.00f, 0, 0);
		emp2.Employeedetails();
		emp2.setSalary();

	}

}
