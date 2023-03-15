package array.assignment.objectarray;

public class Main {

	public static void main(String[] args) {
		
		Object[] obj = new Object[2];
		
		obj[0]=new Employee(101, "Mahesh",450000.0f);
		obj[1]=new Student(102, "Rohit",88);
		
		((Employee) obj[0]).display();
		System.out.println("\n************************\n");
		((Student) obj[1]).display();
		
	}

}
