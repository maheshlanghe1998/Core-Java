package com.string.classprograms;

public class Test {
	Test(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		Test t1=new Test("Mahesh");
		Test t2 = new Test("Mahesh");
		 System.out.println(t1.equals(t2)); //ref. comparison
		 System.out.println(t1==t2);
		 
		 String str1= new String("Mahesh");
		 String str2= new String("Mahesh");
		 System.out.println(str1.equals(str2));//content comparison
		 System.out.println(str1==str2);
		 
		 String st1 ="mahi";
		 String st2="mahi";
		 System.out.println(st1.equals(st2));//content comparison
		 System.out.println(st1==st2);
		 
		 StringBuffer str3 = new StringBuffer("program");
		 StringBuffer str4 = new StringBuffer("program");
		 System.out.println(str3.equals(str4));//ref. comparison
		 System.out.println(str3==str4);
		 

	}

}
