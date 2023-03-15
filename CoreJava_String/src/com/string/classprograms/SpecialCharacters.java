package com.string.classprograms;

public class SpecialCharacters {

	public static void main(String[] args) {
		String str="@ja#v!apro()gra^mmi+ng";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
