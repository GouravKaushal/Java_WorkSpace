package com.zensar.myfirstproject.client;

public class Strings {
	private static String STATIC = "working";
	
	private String a = null;

	public static void main(String ads[]) {
		String a = "working";
		Strings st = new Strings();
		st.a = "working";
		System.out.println(Strings.STATIC == a);
	}
}
