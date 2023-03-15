package collection.assignments.bookmanipulation;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	
	ArrayList<Book> bookList = new  ArrayList<Book>();
	
	public void addBook(Book bobj)
	{
		bookList.add(bobj);
		
	}
	
	 public boolean isEmpty()
	{
		return bookList.isEmpty();
		
	}
	 
	 ArrayList<Book> viewAllBooks()
	 {
		 
		return bookList;
		 
	 }

	 
	 ArrayList<Book> viewBooksByAuthor(String author ) 
	 { 
	 ArrayList<Book> al=new ArrayList<Book>();
     Iterator it=bookList.iterator();
     while(it.hasNext())
     {
         Book b=(Book)it.next();
         if(b.getAuthor().equalsIgnoreCase(author))
         al.add(b);
     }
     return al;
		 
	 }
	 
	 
	 int countnoofbook(String name)
	 {
		 int count=0;
         Iterator it=bookList.iterator();
         while(it.hasNext())
         {
             Book b=(Book)it.next();
             if(b.getBookName().equalsIgnoreCase(name))
             count++;
         }
         return count;
		 
	 }
}
