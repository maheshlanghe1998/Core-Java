package com.collection.classprograms;

public class Student  implements Comparable<Student> {

	private String std_name;
	private int rollno;
	private int std_age;
	
	
	public Student(String std_name, int rollno, int std_age) {
		super();
		this.std_name = std_name;
		this.rollno = rollno;
		this.std_age = std_age;
	}


	public String getStd_name() {
		return std_name;
	}


	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getStd_age() {
		return std_age;
	}


	public void setStd_age(int std_age) {
		this.std_age = std_age;
	}


	@Override
	public String toString() {
		return "Student [std_name=" + std_name + ", rollno=" + rollno + ", std_age=" + std_age + "]";
	}


	@Override
	public int compareTo(Student o) {
		
		int compareAge = o.getStd_age();
		return this.std_age-compareAge;
		
		//return compareAge-this.std_age;
	}
	
	
	
	
}
