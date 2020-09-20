package com.zensar.myfirstproject.shape;

import com.zensar.myfirstproject.beans.NewShape;
import com.zensar.myfirstproject.beans.Printable;

public class Circle extends NewShape implements Printable{

	private int radius;
	private static int count;

	public Circle() {
		radius = 1;

	}

	public Circle(int r) {
		radius = r;

	}

	public int getCount() {
		return count;
	}

	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public void display(String s) {
		System.out.println("Method overriden from Printable Interface \naddition msg "+s);
		
	}

	@Override
	public void test() {
		System.out.println("Method overriden from  NewShape");
		
	}

}
