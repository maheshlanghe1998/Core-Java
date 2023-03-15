package assignment.day12.students;

public abstract class Student {
      String name;
      String class1;  
      
      public Student(String name, String class1) {
		
		this.name = name;
		this.class1 = class1;
	}

	public abstract double getPercentage();
      
      static void getTotalNoStudents(int count)
      {
    	  System.out.println("Total No Of Students: "+count);
      }
}
