package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a,b,c,d,e,x,y;
		x= 10;
		y = 20;
		a=x+=3;
		b=x-=3;
		c=x*=3;
		d=x/=3;
		e=x%=3;
		x=y;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+x);

	}

}
