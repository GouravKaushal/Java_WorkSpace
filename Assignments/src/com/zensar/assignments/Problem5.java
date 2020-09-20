package com.zensar.assignments;

public class Problem5 {
	private int num1, num2;

	public Problem5(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void swap() {
		System.out.println("Before Swapping :");
		System.out.println(num1 + " " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping :");
		System.out.println(num1 + " " + num2);
	}

}
