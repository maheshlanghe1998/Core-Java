package assignment.day12.Interface;

public class ClassTwo extends ClassOne  implements InterfaceFour
{
   public void methodThree()
   {
	   System.out.println("This Is Method Three");
   }
	
	@Override
	public void methodFour() {
		
		 System.out.println("This Is Method Four");
	}

}
