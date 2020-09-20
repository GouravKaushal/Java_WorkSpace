package com.zensar.myfirstproject.beans;

public enum Days {
	SUN(18), MON(117), TUE(26), WED(57), THR(58), FRI(23), SAT(15);

	int i;

	Days(int i) {
		this.i = i;
	}
	public int getValue(int v)
	{
		return  i;
	}
}
