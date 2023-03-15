package com.string.classprograms;

public class StringRepresentation {

	public static void main(String[] args) {
		
		String charvalue=String.valueOf('c');
		String booleanvalue=String.valueOf(false);
		String byteValue = String.valueOf(123);
		
		System.out.println("Char value "+charvalue);
		System.out.println("Boolean value "+booleanvalue);
		System.out.println("Byte Value "+byteValue+34);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
	}

}
