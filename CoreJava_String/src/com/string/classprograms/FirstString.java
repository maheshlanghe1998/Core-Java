package com.string.classprograms;

public class FirstString {

	public static void main(String[] args) {
		
		//String using literal:
		String str  = "Mahesh";
		str.concat(" Langhe");
		
		System.out.println(str);
		
		String str1=str.concat(" Langhe");
		System.out.println(str1);
		//OR
		System.out.println(str.concat(" Langhe"));
		
		//String using new keyword:
		//when we create String with new keyword it will create 2 objects.
		//one in heap and other one in constant string pool
		String s = new String("mahi");
		System.out.println(s);
		
		//Stringbuffer:
		
		StringBuffer sb=new StringBuffer("Greatcoder");
		sb.append(" Technologies");
		System.out.println(sb);
     
		
		//In literal approach, both of the same reference variable are pointing to same object. 
		String st1="Mahesh";
		String st2="Langhe";
		String st3="Mahesh";
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		
		
		//In case of new keyword 
		String s1=new String ("Mahesh");
		String s2=new String ("Langhe");
		String s3=new String ("Mahesh");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
	}

}
