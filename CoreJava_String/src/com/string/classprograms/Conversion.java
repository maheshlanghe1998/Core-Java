package com.string.classprograms;

public class Conversion {

	public static void main(String[] args) {
		String str =new String("Mahesh");
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
		
		StringBuffer sb1 =new StringBuffer("Sidhhesh");
		String str1=new String(sb1);
		System.out.println(str1.toUpperCase());
	}

}
