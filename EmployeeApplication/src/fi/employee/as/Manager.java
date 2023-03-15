package fi.employee.as;


public class Manager extends Employee{
float hra;
	
	//Constructor for HRA 
	public Manager(String name, String address, int age, String gender, int salary,float hra)
	{
		super(name, address, age, gender, salary);
		this.hra=hra;
	}
	
	//Getter and Setter for HRA
	
	
	public float getHra() {
		return hra;
	}
	
	public void setHra(float hra) 
	{
		try {
			if(hra<0) throw new Exception();
			this.hra = hra;
			
			
		} catch (Exception e) {
			
			System.out.println("Invalid Input");
		}
	}
	
}
