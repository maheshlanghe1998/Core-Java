package com.collection.classprograms;

public class Employee implements Comparable<Employee>{

	private int emp_id ;
	private String emp_name;
	
	
	
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}



	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	
	public void display()
	{
		System.out.println("Employee id: "+emp_id+" Employee name:  "+emp_name);
	}

	@Override
	public int compareTo(Employee o) {
		if(this.emp_id==o.getEmp_id())
		return 0;
		else if(this.emp_id>o.emp_id)
			return +1;
		else
			return -1;
		
	}

	
}
