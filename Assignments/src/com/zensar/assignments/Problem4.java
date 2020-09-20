package com.zensar.assignments;

public class Problem4 {

	int num1, num2, num3, numLength, num4, num6, numLength2;

	public Problem4(int num1, int num4) {
		super();
		this.num1 = num1;
		this.num4 = num4;
		num2 = 0;
		num3 = num1;
		numLength = 0;

		num6 = num4;
		numLength2 = 0;

	}

	public void covertDecimalToBinary() {
		while (num3 != 0) {
			num3 = num3 / 2;
			numLength++;
		}

		num3 = num1;
		int[] ar = new int[numLength];

		int i = numLength;
		while (num3 != 0) {
			ar[--i] = num3 % 2;
			num3 = num3 / 2;

		}
		System.out.print("Binary Conversion of " + num1 + " is ");
		for (i = 0; i < numLength; i++) {
			System.out.print(ar[i]);
		}

	}

	public void convertBinaryToDecimal() {

		while (num6 != 0) {
			num6 = num6 / 10;
			numLength2++;
		}
		num6 = num4;
		int[] ar2 = new int[numLength2];
		int i = numLength2 - 1;
		while (num6 != 0) {
			ar2[i--] = num6 % 10;
			num6 = num6 / 10;
		}

		int res = 0;
		for (i = 0; i < numLength2; i++) {
			ar2[i] = ar2[i] * calcPower((numLength2 - i) - 1);
			res = res + ar2[i];
		}
		System.out.println("\nDecimal Conversion of " + num4 + " is " + res);
	}

	public int calcPower(int n) {
		int x = 1;
		for (int i = 0; i < n; i++) {
			x = x * 2;
		}
		return x;
	}
}
