package assignment.day13.EmployeeAuth;

public class Employee 
{
     private String userName;
     private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
	
	public boolean login()
	{
		if(userName.equals("Maheshlanghe123") && password.equals("Mahesh@123"))
		{
			return true;	
		}
		
		return false;
		
	}
}
