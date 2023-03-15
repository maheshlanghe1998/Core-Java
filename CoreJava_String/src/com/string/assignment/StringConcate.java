package com.string.assignment;

import java.util.Scanner;

public class StringConcate {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inmate's name: ");
        String firstName = sc.nextLine();
        System.out.println("Inmate's father's name: ");
        String secondName = sc.nextLine();
        
        String str = " ";
        
        
        if(firstName.contains(" ") || secondName.contains(" ") ||
        		(secondName.matches("^[a-zA-Z]*$")) && (firstName.matches("^[a-zA-Z]*$")))
        {
            //System.out.println(firstName.toUpperCase()+str+secondName.toUpperCase());
        
        	String str1= firstName.toUpperCase().concat(str);
        	String str2 = str1.concat(secondName.toUpperCase());
        	System.out.println(str2);
        }
        else
        {
           System.out.println("Invalid name");
           System.exit(0);
        }

	}

}
