package com.collection.classprograms;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Set<Employee> treeSet = new TreeSet<Employee>();
		
		Employee emp1 = new Employee(101, "Mahesh");
		Employee emp2 = new Employee(105,"Sid");
		Employee emp3 = new Employee(108, "Shub");
		Employee emp4 = new Employee(102, "Kiran");
		
		
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);

		
		for(Employee emp : treeSet)
		{
			emp.display();
		}
	}

}
