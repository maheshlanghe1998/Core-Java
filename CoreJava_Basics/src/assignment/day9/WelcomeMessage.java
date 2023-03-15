package assignment.day9;

public class WelcomeMessage {
	
	public static String welcomeMessage(String userName,int visitorsNum)
	{
		
		return "Welcome "+userName+"! You are visitor #"+visitorsNum+".";
				
	}

	public static void main(String[] args) 
	{
		System.out.println(welcomeMessage("Mahesh",10));
	}

}
