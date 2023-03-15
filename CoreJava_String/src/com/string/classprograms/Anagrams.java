package com.string.classprograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1="act";
		String str2="cat";
		System.out.println("Both the Strings are Anagram or not: "+anagramCheck(str1,str2));

	}

	public static boolean anagramCheck(String str1, String str2) {
		char []charArray1=str1.toCharArray();
		char []charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

}
