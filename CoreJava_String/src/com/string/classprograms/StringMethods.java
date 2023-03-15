package com.string.classprograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = new String("javaprogramming");
		String s2 = new String("HELLOWORLD");
		String s3 = new String("helloworld");
		System.out.println(s1.length());
		System.out.println(s2.charAt(6));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.lastIndexOf('g'));
		System.out.println(s3.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.replace('L', 'a'));
		System.out.println(s3.replace('o', 'a'));
		System.out.println(s3.replaceAll("l", "m"));
		System.out.println(s1.startsWith("j"));
		System.out.println(s2.endsWith("D"));
		System.out.println(s2.contains("L"));
		System.out.println(s2.substring(5));
		System.out.println(s3.substring(0, 5));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		
		
		
		

	}

}
