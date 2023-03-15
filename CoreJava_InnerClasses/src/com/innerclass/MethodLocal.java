package com.innerclass;


class Outer5
{
	private int a = 100;
	void m1()
	{
		class Inner5
		{
			void innerMethod()
			{
				System.out.println("Inner class method");
				System.out.println(a);
			}
		}
		
		Inner5 i = new Inner5();
		i.innerMethod();
	}
}


public class MethodLocal {

	public static void main(String[] args) {
		Outer5 o= new Outer5();
		
		o.m1();

	}

}
