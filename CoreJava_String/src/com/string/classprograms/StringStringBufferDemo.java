package com.string.classprograms;

public class StringStringBufferDemo {

	public static void main(String[] args) {
		//immutable
		String str = new String("mahesh");
		str.concat("langhe");
		System.out.println(str);
		
		//mutable
		//StringBuffer sb =new StringBuffer("Mahi");
		//System.out.println(sb);
		
		StringBuffer sb =new StringBuffer();
		System.out.println(sb);
		sb.append("LangheMahesh1234");
       System.out.println(sb.capacity());
       sb.append("Suresh");
       System.out.println(sb.capacity());
	}

}
