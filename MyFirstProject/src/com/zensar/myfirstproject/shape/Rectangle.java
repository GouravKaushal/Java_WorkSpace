package com.zensar.myfirstproject.shape;

import com.zensar.myfirstproject.beans.Shape;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public double calculateArea() {
		return length * breadth;
	}
}
