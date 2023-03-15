package com.string.assignment;

import java.util.Scanner;

public class PencilCount {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the standard: ");
		int std =sc.nextInt();
		
		int pencil=0,power=0;
		if(std>=1 && std<=12)
		{    
			for(int i=1;i<=std;i++)
			{
				power =i*i;
				
				pencil +=power;
				
			}
			
			System.out.println("Nila gets "+pencil+" pencils");
		}
		else
		{
			System.out.println("Invalid Standard");
		}
	}

}
