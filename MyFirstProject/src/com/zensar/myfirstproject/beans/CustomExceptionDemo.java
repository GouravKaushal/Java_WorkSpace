package com.zensar.myfirstproject.beans;

public class CustomExceptionDemo {
	
	public void checkNum(int num)  throws OddNumberException{
		if(num%2==0)
		{
			System.out.println(" Even Number is allowed..!!!!");
		}
		else
		{
			throw new OddNumberException("Odd not allowed");
		}
	}
	
}
