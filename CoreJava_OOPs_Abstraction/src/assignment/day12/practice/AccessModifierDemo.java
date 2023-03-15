package assignment.day12.practice;

import practiceaccessmodifier.AcessModifiers;

public class AccessModifierDemo extends AcessModifiers 
{
	
	public static void main(String[] args) {
		AccessModifierDemo ad=new AccessModifierDemo();
		AcessModifiers am= new AcessModifiers();
		am.m1();// calling public method outside of class and outside of package by using same class object.
		ad.m1();// calling public method outside of class and outside of package by extending the class 
		ad.m3();// calling protected method outside of class and outside of package by extending the class 
        
	}

}
