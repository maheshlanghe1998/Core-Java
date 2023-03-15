package com.string.assignment;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of ticket:");
        int ticket=sc.nextInt();
        System.out.println("Do you want refreshment:");
        char ref =sc.next().charAt(0);
        System.out.println("Do you have coupon code:");
        char coupon =sc.next().charAt(0);
        System.out.println("Enter the circle:");
        char circle =sc.next().charAt(0);
       
        int king=75, queen=150,refreshment=50;
        double price = 0;
        	if(circle=='k' || circle=='q')
        	{
        		 if(ticket>=5 && ticket<=40)
        	        {
        			 
        			  if(ticket>20 && circle=='k' && coupon=='y')
        			 {
        				 if(ref=='y')
        				 {
        				 price=(ticket*king);
        				 double totalCost=(price-((price*0.1)+(price*0.02)))+(ticket*refreshment);
        				 System.out.printf("Ticket cost: %.2f",totalCost);
        				 }
        				 else
        				 {
        					 price=ticket*king;
            				 double totalCost=price-((price*0.1)+(price*0.02));
            				 System.out.printf("Ticket cost: %.2f",totalCost); 
        				 }
        				
        			 }
        			  else if(coupon=='y' && circle=='k')
         			 {
        				 if(ref=='y')
         				 {
         				 price=(ticket*king);
         				 double totalCost=(price-(price*0.02))+(ticket*refreshment);
         				 System.out.printf("Ticket cost: %.2f",totalCost);
         				 }
         				 else
         				 {
         					 price=ticket*king;
             				 double totalCost=price-(price*0.02);
             				 System.out.printf("Ticket cost: %.2f",totalCost); 
         				 }
         			 }
        			  else
        			  {
        			 if(ticket>20 && circle=='k')
        			 {
        				 if(ref=='y')
        				 {
        				 price=(ticket*king);
        				 double totalCost=(price-(price*0.1))+(ticket*refreshment);
        				 System.out.printf("Ticket cost: %.2f",totalCost);
        				 }
        				 else
        				 {
        					 price=ticket*king;
            				 double totalCost=price-(price*0.1);
            				 System.out.printf("Ticket cost: %.2f",totalCost); 
        				 }
        				
        			 }
        			
        		}
        		 if(ticket>20 && circle=='q' && coupon=='y')
         			 {
         				 if(ref=='y')
         				 {
         				 price=(ticket*queen);
         				 double totalCost=(price-((price*0.1)+(price*0.02)))+(ticket*refreshment);
         				 System.out.printf("Ticket cost: %.2f",totalCost);
         				 }
         				 else
         				 {
         					 price=ticket*queen;
             				 double totalCost=price-((price*0.1)+(price*0.02));
             				 System.out.printf("Ticket cost: %.2f",totalCost); 
         				 }
         				
         			 }
        		 else if(coupon=='y' && circle=='q')
    			 {
        			 if(ref=='y')
     				 {
     				 price=(ticket*queen);
     				 double totalCost=(price-(price*0.02))+(ticket*refreshment);
     				 System.out.printf("Ticket cost: %.2f",totalCost);
     				 }
     				 else
     				 {
     					 price=ticket*queen;
         				 double totalCost=price-(price*0.02);
         				 System.out.printf("Ticket cost: %.2f",totalCost); 
     				 }
     				
    			 }
        		 else {
        			 if(ticket>20 && circle=='q')
        			 {
        				 if(ref=='y')
        				 {
        				 price=ticket*queen*refreshment;
        				 double totalCost=price-(price*0.1);
        				 System.out.printf("Ticket cost: %.2f",totalCost);
        				 }
        				 else
        				 {
        					 price=ticket*queen;
            				 double totalCost=price-(price*0.1);
            				 System.out.printf("Ticket cost: %.2f",totalCost); 
        				 }
        				
        			   } 
        			 }
        	    }
        		 else
        	        {
        	        	System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        	        }
        	        
        	}
        	else
        	{
        		System.out.println("Invalid Input");
        	}
        
	}

}
