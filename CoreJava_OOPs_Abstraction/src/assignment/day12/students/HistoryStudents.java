package assignment.day12.students;

public class HistoryStudents extends Student
{
	 int historyMarks;
     int civicsMarks;
     
	 public HistoryStudents(String name, String class1,int historyMarks, int civicsMarks) {
		super(name, class1);
		
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
	}

	@Override
	public double getPercentage() {
      double percentage=((historyMarks+civicsMarks)/2);
	  return percentage;
	}
	
     
}
