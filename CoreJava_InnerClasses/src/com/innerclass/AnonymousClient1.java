package com.innerclass;

public class AnonymousClient1 {
	
	
	Test t = new Test()
	
	{
		void m1()
		{
			System.out.println("m1 method");
			System.out.println(t.getClass().getName());
		}
		
		void m2() {
			System.out.println("m2 method");
		}
	};

	public static void main(String[] args) {
		
		AnonymousClient1 c= new AnonymousClient1();
		
		c.t.m1();
		c.t.m2();

	}

}
