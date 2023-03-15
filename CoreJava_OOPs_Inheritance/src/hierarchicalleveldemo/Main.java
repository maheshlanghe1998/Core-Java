package hierarchicalleveldemo;

public class Main {

	public static void main(String[] args) {
		
		Developer obj= new Developer(194891, "Mahesh Langhe", "Pune(Maharashtra)","+91-7038531656", 46175.00f,"Software Developer");
		obj.display();
		
		
		System.out.println("\t************************************");
	

		Tester obj1= new Tester(198992, "Akash Thakur", "Mumbai(Maharashtra)","+91-7984562600", 75000.00f,"Software Tester");
		obj1.display();
		
	}

}
