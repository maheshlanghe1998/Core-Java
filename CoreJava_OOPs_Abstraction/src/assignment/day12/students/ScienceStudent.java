package assignment.day12.students;

public class ScienceStudent extends Student
{      
	 int physicsMarks;
     int chemistryMarks;
     int mathMarks;
     static int noOfStudents;
     
	   public ScienceStudent(String name, String class1, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, class1);
		  this.physicsMarks=physicsMarks;
		  this.chemistryMarks=chemistryMarks;
	      this.mathMarks=mathMarks;
	     
	}


	@Override
	public double getPercentage() {
		
		double percentage=((physicsMarks+ chemistryMarks + mathMarks)/3);
		
		return percentage;
			
	}
	
       
}
