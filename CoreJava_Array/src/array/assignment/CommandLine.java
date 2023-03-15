package array.assignment;

public class CommandLine {

	public static void main(String[] args) {
		
		 int greatest=Integer.parseInt(args[0]),
		 least=Integer.parseInt(args[0]);
		System.out.println("Array Elements are: \n");
		 for(int i=0;i<args.length;i++) 
		{
			System.out.print(Integer.parseInt(args[i])+" ");  
		}
		//45 60 78 91 42 31 
		for(int i=1;i<args.length;i++) 
		{
			if(Integer.parseInt(args[i])>greatest) 
			{
				greatest=Integer.parseInt(args[i]);
			}
		}
		System.out.println("\n\nGreatest Element: "+greatest);
		 
		for(int i=1;i<args.length;i++) 
		{
			if(Integer.parseInt(args[i])<least) 
			{
				least=Integer.parseInt(args[i]);
			}
		}
		System.out.println("\nleast Element: "+least);
		 

	}

}
