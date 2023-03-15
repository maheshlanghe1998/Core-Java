package employeesalaryhike;

public class Main {

	public static void main(String[] args) {
		
		FullTimeEmployee emp1=new FullTimeEmployee();
	    InternEmployee emp2=new InternEmployee();
	    
		System.out.println("The salary before increment: ");
		emp1.display();
		emp2.display();
		System.out.println("The salary After increment: ");
        emp1.incrementDisplay();      
        emp2.incrementDisplay();
	}

}
