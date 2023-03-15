package com.string.classprograms;

import java.util.Scanner;

public class Capitalizedemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();
		String uprCase="";
		Scanner strScan = new Scanner(str);
		
		while(strScan.hasNext())
		{
			String word=strScan.next();
			uprCase+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
			
			
		}
       System.out.println("original sentence : "+str);
       System.out.println("sentence after conversion : "+uprCase.trim());
	}

}
