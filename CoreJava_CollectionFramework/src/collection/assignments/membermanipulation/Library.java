package collection.assignments.membermanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Library 
{
	
	List<Member> memberList = new ArrayList<Member>();
	
	public void addMember(Member memberObj)
	{
		memberList.add(memberObj);
	}
	
	 public boolean isEmpty()
		{
			return memberList.isEmpty();
			
		}
	
	 public List<Member> viewAllMembers()
	 {
		return memberList;
		 
	 }
	 
	 public List<Member> viewMembersByAddress(String address) 
	 {
		 List<Member> al=new ArrayList<Member>();
	     Iterator it=memberList.iterator();
	     while(it.hasNext())
	     {
	         Member m=(Member)it.next();
	         if(m.getAddress().equalsIgnoreCase(address))
	         al.add(m);
	     }
	     return al;
			 
		 
	 }
}
