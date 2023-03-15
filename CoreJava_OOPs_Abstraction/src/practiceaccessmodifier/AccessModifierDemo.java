package practiceaccessmodifier;

public class AccessModifierDemo 
{
     public static void main(String agrs[])
     {
    	 AcessModifiers obj = new AcessModifiers();
    	 obj.m1();//calling public modifier outside class and in same package.
    	 obj.m2();//calling default modifier outside class and in same package.
    	 obj.m3();//calling protected modifier outside class and in same package(without extending)
     }
}
