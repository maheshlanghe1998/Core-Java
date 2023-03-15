package basics;

class Student {
}

 class Employee {
}

public class School {

	// Declare a method with return type Student class.
	Student m1() {
		System.out.println("m1 method");
		Student st = new Student(); // Line 1
		// Return the object reference variable named st as a value. return st;
		// Line 2
		// We can replace line 1 and line 2 code by using a single line of code.
		return new Student();
		// This line of code is generally used in the project level.
	}

	// Similarly, declare another method with return type Employee class.
	Employee m2() {
		System.out.println("m2 method");
		Employee emp = new Employee();
		// Line 3 return emp; // Line 4
		return new Employee();
		// For line 3 and 4.
	}

	// Declare static method with return type String.
	static String m3() {
		System.out.println("Shubh");
		return "Shubh";
	}

	public static void main(String[] args) { // Create an object of class School.
		School sc = new School();
		// Call m1() method using reference variable sc and store returning value by
		// using a variable s.
		Student s = sc.m1();
		System.out.println(s);
		Employee e = sc.m2();
		System.out.println(e);
		String str = School.m3();
		System.out.println(str);
	}

}
