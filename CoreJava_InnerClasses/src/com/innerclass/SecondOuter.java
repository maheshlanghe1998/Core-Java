package com.innerclass;

class Outer2
{
	int i = 100;
	void m1()
	{
		//System.out.println(j);
		System.out.println("m1 method ");
	}
	
	class Inner2
	{
		int j = 200;
		void m2()
		{
			i=i+10;
			System.out.println(i);
		}
	}
}

public class SecondOuter {
	
	public static void main(String[] args) {
		
		Outer2  o = new Outer2();
		
		Outer2.Inner2 i=o.new Inner2();
		
		i.m2();
		o.m1();
	}

}
