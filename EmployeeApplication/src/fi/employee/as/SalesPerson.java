package fi.employee.as;



public class SalesPerson extends Employee {
	float commission;

	public SalesPerson(String name, String address, int age, String gender, int salary, float commission) 
	{
		super(name, address, age, gender, salary);
		this.commission = commission;
	}


	//Getter and Setter for Commission
	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		
		try {
			if(commission<0) throw new Exception();
			this.commission = commission;
			
			
		} catch (Exception e) {
			
			System.out.println("Invalid Input");
		}
	}
	
}
