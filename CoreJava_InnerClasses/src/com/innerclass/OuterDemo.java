package com.innerclass;

class Outer
{
	private int a = 100;
	class Inner
	{
		void data()
		{
			System.out.println("The value is "+a);
		}
	}
}

public class OuterDemo {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();
		
		i.data();

	}

}
