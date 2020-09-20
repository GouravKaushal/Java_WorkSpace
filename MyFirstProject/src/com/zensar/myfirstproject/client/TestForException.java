package com.zensar.myfirstproject.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.zensar.myfirstproject.beans.Employee;

public class TestForException {

	public static void main(String[] args) {

		List<Employee> lists = new ArrayList<Employee>();

		lists = Arrays.asList(new Employee(101, "Ramesh", 1000),
				new Employee(103, "Abhay", 5000),
				new Employee(102, "Zayn", 350000));

		System.out.println("Normal " + lists);

		Collections.sort(lists);

		System.out.println("Sorted By ID :" + lists);

		Collections.sort(lists, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}

		});
		System.out.println("Sorted By Name" + lists);

	}
}
