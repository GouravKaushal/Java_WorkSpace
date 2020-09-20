package com.zensar.assignments;

public class Problem1 {

	int num1;
	int num2;
	int num3;

	public Problem1(int num1) {
		super();
		this.num1 = num1;
	}

	public void checkPalindrome() {

		num2 = num1;
		while (num2 != 0) {
			num3 = num3 * 10 + num2 % 10;
			num2 = num2 / 10;
		}
		if (num3 == num1)
			System.out.println("Number " + num1 + " is Palindrome ..!!!");
		else
			System.out.println("Number " + num1 + " is Not a Palindrome ..!!!");

	}

}
