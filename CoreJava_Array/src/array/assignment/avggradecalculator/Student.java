package array.assignment.avggradecalculator;

import java.util.Scanner;

public class Student 
{
	
	private int id;
	private String name;
	private int marks[];
	private float average ;
	private char grade;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int marks[]) 
	{
		this.marks = marks;
	}
	public float getAverage() 
	{
		return average;
	}
	public void setAverage(float average)
	{
		this.average = average;
	}
	public char getGrade() 
	{
		return grade;
	}
	public void setGrade(char grade) 
	{
		this.grade = grade;
	}
	
	public void calculateAvg()
	{
	    Student obj = new Student();
		
		Scanner sc =new Scanner(System.in);
		
		int sum=0,count=0;
				
		System.out.println("Enter the id: ");
		obj.setId(sc.nextInt());
		System.out.println("Enter the Name: ");
		obj.setName(sc.next());
		System.out.println("Enter the no of subjects: ");
		int subject= sc.nextInt();
		if(subject<=0)
		{
			System.out.println("Invalid subject");
		}
		else
		{
			int marks[] =new int[subject]; 
			   
			for(int i=0;i<marks.length;i++)    
			{
				System.out.println("Enter mark for subject "+(i+1)+":");
				marks[i]=sc.nextInt();
			}
			for(int i=0;i<marks.length;i++)
			{
				if(marks[i]>0 && marks[i]<=100)
				{
					sum+=marks[i];
					count++;
				}
			
			}
			if(count!=0)
			{
				average=sum/subject;
				
				obj.setAverage(average);
				
				System.out.println("Id: "+obj.getId()+"\nName: "+obj.getName()+"\nAvg: "+obj.getAverage());
			}
			else
			{
				System.out.println("Marks out of range");
			}
			
		}
		
	}
	
	
	public void findGrade()
	{
			Student obj1 = new Student();
			 if(average>=80 && average<=100)
			 {
				 obj1.setGrade('O'); 
			 }
			 else if(average>=50 && average<=79)
			 {
				 obj1.setGrade('A');
			 }
			else if(average<50)
			{
				obj1.setGrade('F');
			}
			
			 System.out.println("Grade: "+obj1.getGrade());
		}
			
	}
		
	

