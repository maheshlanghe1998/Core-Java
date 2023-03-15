package com.collection.classprograms;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Mahesh", 111, 24));
		list.add(new Student("Sid", 112, 25));
		
		
		Collections.sort(list);
		
		for(Student st : list)
		{
			System.out.println(st);
		}
	}

}
