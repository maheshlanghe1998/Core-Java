package array.assignment.objectarray;

public class Student {
    int std_id;
    String std_name;
    int marks;
    
	public Student(int std_id, String std_name,int marks) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.marks= marks;
		
	}
    
	 
	public void display()
	{
		System.out.println("Student Id    : "+std_id);
		System.out.println("Students Name : "+std_name);
		System.out.println("Student marks : "+marks);
	}
}
