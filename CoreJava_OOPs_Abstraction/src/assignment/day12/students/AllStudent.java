package assignment.day12.students;

public class AllStudent {
	public static void main(String args[])
    {  
	
   	    int count=0;
	    ScienceStudent ss1=new ScienceStudent("Mahesh", "XII", 80, 70, 85);
	    System.out.println("Percentage of 1st Science Student : "+ss1.getPercentage());
	    count++;
	    ScienceStudent ss2=new ScienceStudent("Sid", "XI", 70, 90, 85);
	    System.out.println("Percentage of 2nd Science Student : "+ss2.getPercentage());
	    count++;
	    HistoryStudents hs1=new HistoryStudents("Shubham", "XI", 90, 95);
	    System.out.println("Percentage of 1st History Student : "+hs1.getPercentage());
	    count++;
	    HistoryStudents hs2=new HistoryStudents("Viraj", "XII", 60, 67);
	    System.out.println("Percentage of 2nd History Student : "+hs2.getPercentage());
	    count++;
	    HistoryStudents hs3=new HistoryStudents("Vishal", "XII", 76, 87);
	    System.out.println("Percentage of 3rd Histroy Student : "+hs3.getPercentage());
	    count++;
	    
	    Student.getTotalNoStudents(count);
	   
    }

}
