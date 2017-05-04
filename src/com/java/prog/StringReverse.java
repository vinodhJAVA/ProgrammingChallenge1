package com.java.prog;

public class StringReverse {

	public static int i;
	public static String result ="";

	public static void stringReverse(String s) {
		char ch[] = new char[s.length()];
		for (i = 0; i < s.length(); i++){
			ch[i] = s.charAt(i);
		}
		for (i = s.length() - 1; i >= 0; i--){
			result=result+ch[i];
		}
		System.out.print(result);
	}

	public static void main(String[] args) {

		System.out.println("String is : ");
		System.out.println("Java is a high level, robust, secured and object-oriented programming language");
		System.out.println("After Reverse operation : ");
		StringReverse.stringReverse("Java is a high level, robust, secured and object-oriented programming language");

	}

}
