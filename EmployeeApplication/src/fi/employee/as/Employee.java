package fi.employee.as;

public abstract class  Employee {
	//Common Parameters
    String name;
    
    String address;
    
    int age ;
    
    String gender;
    
    int salary;
    
   // Construct to set Common Parameters
	public Employee(String name, String address, int age, String gender, int salary) 
	{
		
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	//getter setter with validation for name:
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name)
	{ 
		if( name != null)
		{
			this.name = name;
			
		}
		else
			System.out.println("Invalid Input");
			
	}
	
	//Getter and Setter with validation for Address

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) 
	{
		if( address != null)
		{
			this.address = address;
			
		}
		else
			System.out.println("Invalid Input");
		
	}

	//Getter and Setter with validation for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{ 
		if( age >= 18)
		{
		this.age = age;
		}
		else
			System.out.println("Invalid Input");
		
	}

	//Getter and Setter for Gender
	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	
	// getter setter with validation for Salary 
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary)
	{
		if(salary<=0)
		{
			System.out.println("Invalid Input");
		}
		else
		this.salary = salary;
	}
    
}
