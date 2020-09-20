package com.zensar.assignments;

public class Problem2 {

	private int num1;
	private int num2;
	private int num3;

	public Problem2(int num1) {
		super();
		this.num1 = num1;
	}

	public int calPower(int n, int numl) {
		int num4 = 1;
		for (int i = 0; i < numl; i++) {
			num4 = num4 * n;
		}
		return num4;
	}

	public void checkArmstrong() {
		num2 = num1;
		int numLength = 0;
		while (num2 != 0) {
			num2 = num2 / 10;
			numLength++;
		}
		num2 = num1;
		while (num2 != 0) {
			num3 = num3 + calPower(num2 % 10, numLength);
			num2 = num2 / 10;

		}

		if (num1 == num3)
			System.out.println("Number " + num1 + " is an Armstrong Number..!!!");
		else
			System.out.println("Number " + num1 + " is not an Armstrong Number..!!!");

	}

}
