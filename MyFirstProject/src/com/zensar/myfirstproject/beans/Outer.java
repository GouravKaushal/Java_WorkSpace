package com.zensar.myfirstproject.beans;

public class Outer {// public or default is allowed

	public int a = 10;

	static class Inner {// any access modifier is allowed
		int b = 15;

		public void display() {
			System.out.println("Inner class");
		}

	}

	public void display() {
		/*
		 * Inner inner=new Inner(); inner.display(); System.out.println(inner.b);
		 */

		class Inner1 {
			public void display2() {
				System.out.println("Method local Inner class");
			}
		}

		Inner1 inner1 = new Inner1();
		inner1.display2();

	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println(outer.a);

		// Inner inner= outer.new Inner();

		Inner inner = new Inner();
		inner.display();

	}
}
