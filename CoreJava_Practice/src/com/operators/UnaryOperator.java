package com.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int  x= 10;
		
		System.out.println(x++);//post-increment
		System.out.println(++x);//pre-increment
		System.out.println(x--);//post-decrement
		System.out.println(--x);//pre-decrement
		System.out.println("*******************");
		System.out.println(x++ + --x - ++x + ++x);
        System.out.println("**********************");
		int a,b;
		a=10;
		b=10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		

	}

}
