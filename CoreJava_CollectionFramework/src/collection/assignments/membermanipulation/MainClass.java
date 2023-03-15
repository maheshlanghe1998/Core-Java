package collection.assignments.membermanipulation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     
	     boolean menu = true;
	     Library lib = new Library();
	     
	     while(menu)
	     {

	    	 System.out.println("1.Add Member");
	         System.out.println("2.View All Members");
	         System.out.println("3.Search Member by address");
	         System.out.println("4.Exit");
	         System.out.println("Enter your choice:");
	         int choice=sc.nextInt();
	         sc.nextLine();
	 
	        	 switch (choice)
	        	 {
	        	 case 1:
	        	 {
	             
	            	 Member obj=new Member();
	                 System.out.println("Enter the member id:");
	                 obj.setMemberId(sc.nextInt());
	                 sc.nextLine();
	                 System.out.println("Enter the Member name:");
	                 obj.setMemberName(sc.nextLine());
	                 
	                 System.out.println("Enter the member address:");
	                 obj.setAddress(sc.nextLine());
	                 
	                 lib.addMember(obj); 
	                System.out.println("\nMember has  been successfully added !\n");
	             
	        	 }
	        	 break;
	             case 2:

	             {
	            	  List<Member> al=lib.viewAllMembers();
	                  if(al.isEmpty())
	                  {
	                      System.out.println("\nThe list is empty\n");
	                      continue;
	                  }
	                  Iterator it=al.iterator();
	                  while(it.hasNext())
	                  {
	                      Member m=(Member)it.next();
	                      System.out.println("\nMember Details ...");
	                      System.out.println("Member Id: "+m.getMemberId());
	                      System.out.println("Member Name:"+m.getMemberName());
	                      System.out.println("Member Address: "+m.getAddress());
	                      System.out.println("********************\n");
	                  }
	             
	            
	             }
	             break;
	             case 3:
	             {
	                 System.out.println("Enter the member address:");      
	                 String add=sc.nextLine();
	                 List<Member> al=lib.viewMembersByAddress(add);
	                 if(al.isEmpty()){
	                     System.out.println("\nNone of the member found with "+add+"\n");
	                     continue;
	                 }
	                 Iterator it=al.iterator();
	                 while(it.hasNext()){
	                     
	                     Member m=(Member)it.next();
	                     System.out.println("\nYour Member Details...");
	                     System.out.println("Member Id: "+m.getMemberId());
	                      System.out.println("Member Name:"+m.getMemberName());
	                      System.out.println("Member Address: "+m.getAddress());
	                     System.out.println("*****************\n");
	                 }
	             
	             
	             }
	             break;
	             
	             case 4:
	             {
	            	 menu = false;
	            	 
	           
	             }
	             break;
	        	 }
	        
	     }
	     
	     System.out.println("APPLICATION CLOSED");
	     

	}

}
