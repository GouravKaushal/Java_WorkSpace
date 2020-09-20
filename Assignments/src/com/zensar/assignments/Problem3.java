package com.zensar.assignments;

public class Problem3 {

	private int num1, num2, num3, range;

	public Problem3(int range) {
		super();
		this.range = range;
		num1 = 0;
		num2 = 1;
		num3 = 0;

	}

	public void printFibonacci() {
		System.out.print(" 0 1 ");
		for (int i = 0; i < range; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
}
