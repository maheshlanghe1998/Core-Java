package basics;

import java.util.Scanner;

public class DisplayCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		char ch1= (char)(a);
		char ch2= (char)(b);
		char ch3= (char)(c);
		char ch4= (char)(d);
		
		System.out.println(a+"-"+ch1);
		System.out.println(b+"-"+ch2);
		System.out.println(c+"-"+ch3);
		System.out.println(d+"-"+ch4);
	}

}
