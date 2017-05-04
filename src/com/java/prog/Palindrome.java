package com.java.prog;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("It is palindrome number ");
		else
			System.out.println("It's not palindrome number");

	}

}
