package com.zensar.myfirstproject.client;

import java.util.Set;
import java.util.TreeSet;

import com.zensar.myfirstproject.beans.Employee;

public class Test1 {

	public static void main(String[] args) {

		Employee e1=new Employee(1003, "Ram", 10000);
		Employee e2=new Employee(1001, "Laxman", 70000);
		Employee e3=new Employee(1005, "Shyam", 90000);
		Employee e4=new Employee(1002, "Aditya", 30000);
		Employee e5=new Employee(1004, "Rohit", 5000);
		
	
		
		Set names = new TreeSet();

		names.add(e1);
		
		names.add(e2);
		
		names.add(e3);
		
		names.add(e4);
		
		names.add(e5); 

		System.out.println(names);
		
		// 1. System.out.println(names);

		/*
		 * 2. for(int i=0;i<names.size();i++) System.out.println();
		 */

		/*
		 * 3. for(Object o:names) System.out.println(o);
		 */

		/*
		 * 4. Iterator i=names.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */

		/* 5.
		 * ListIterator i = names.listIterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */

	}
}
