package assignment.day6;

public class ChristmasTreePattern {

	
		public static void main(String args[])
		{
		  {
		//Value 4 is height of tree or total pyramids to print.
		    int height = 4;
		 
		//Assigning Width which is width of each pyramid.
		int width = 4;
		 
		//Assigning Space
		// These spaces will be printed before each pyramid.
		int space = width * height;
		 
		int x = 1;
		 
		//Code to Print Upper Part of the Tree i.e. Pyramids.
		for(int a = 1;a <= height ;a++)
		        {
		  for(int i = x;i <= width;i++)
		  {
		 
		   for(int j = space;j >= i;j--)
		   {
		System.out.print(" ");
		   }
		 
		   for(int k = 1;k <= i;k++)
		   {
		System.out.print("* ");
		   }
		 
		   System.out.println();
		  }
		        // we increase x and width for printing each pyramid.
		x = x+2;
		width = width+2;
		}
		 
		//Printing Branch or trunk of Christmas Tree
		// we run loop till i = 3 i.e. height -1.
		for(int i = 1;i <= height-1;i++)
		{
		         // we can also initialize j = space - height - 1.
		  for(int j = space-3;j >= 0;j--)
		  {
		   System.out.print(" ");
		  }
		 
		  for(int k= 1;k <= height-1;k++)
		  {
		System.out.print("* ");
		  }
		 
		System.out.println();
		}
		}
		}
}
