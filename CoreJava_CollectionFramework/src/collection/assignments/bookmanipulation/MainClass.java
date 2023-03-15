package collection.assignments.bookmanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     
     boolean menu = true;
     Library lib = new Library();
     
     while(menu)
     {
    	 System.out.println("1.Add Book");
         System.out.println("2.Display all book details");
         System.out.println("3.Search Book by author");
         System.out.println("4.Count number of books");
         System.out.println("5.Exit");
         System.out.println("Enter your choice:");
         int choice=sc.nextInt();
         sc.nextLine();
 
        	 switch (choice)
        	 {
        	 case 1:
        	 {
             
            	 Book bobj=new Book();
                 System.out.println("Enter the isbn no:");
                 bobj.setIsbnno(sc.nextInt());
                 sc.nextLine();
                 System.out.println("Enter the book name:");
                 bobj.setBookName(sc.nextLine());
                 
                 System.out.println("Enter the author name:");
                 bobj.setAuthor(sc.nextLine());
                 
                 lib.addBook(bobj); 
                System.out.println("\nBook Successfully added to library!\n");
             
        	 }
        	 break;
             case 2:

             {
            	  ArrayList<Book> al=lib.viewAllBooks();
                  if(al.isEmpty())
                  {
                      System.out.println("\nThe list is empty\n");
                      continue;
                  }
                  Iterator it=al.iterator();
                  while(it.hasNext())
                  {
                      Book b=(Book)it.next();
                      System.out.println("\nBook Details ...");
                      System.out.println("Isbn No: "+b.getIsbnno());
                      System.out.println("Book name:"+b.getBookName());
                      System.out.println("Author name: "+b.getAuthor());
                      System.out.println("********************\n");
                  }
             
            
             }
             break;
             case 3:
             {
                 System.out.println("Enter the author name:");      
                 String name=sc.nextLine();
                 ArrayList<Book> al=lib.viewBooksByAuthor(name);
                 if(al.isEmpty()){
                     System.out.println("\nNone of the book published by the author "+name+"\n");
                     continue;
                 }
                 Iterator it=al.iterator();
                 while(it.hasNext()){
                     
                     Book b=(Book)it.next();
                     System.out.println("\nYour Book Details...");
                     System.out.println("Isbn no: "+b.getIsbnno());
                     System.out.println("Book name: "+b.getBookName());
                     System.out.println("Author name: "+b.getAuthor());
                     System.out.println("*****************\n");
                 }
             
             
             }
             break;
             case 4:
             {
            	 System.out.println("Enter the book name");
                 String name=sc.nextLine();
                 System.out.println("Count is "+lib.countnoofbook(name)+"\n"); 
                
             }
             break;
             case 5:
             {
            	 menu = false;
            	 // System.exit(0);
           
             }
             break;
        	 }
        
     }
     
     System.out.println("APPLICATION CLOSED");
     
         }
     }


