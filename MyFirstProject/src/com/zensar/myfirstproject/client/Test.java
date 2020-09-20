package com.zensar.myfirstproject.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.zensar.myfirstproject.beans.Shape;

public class Test {
	public static double area(Shape shape) {
		return shape.calculateArea();
	}

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("./resources/abc.txt");
			fos = new FileOutputStream("./resources/abc2.txt");
			int ch = 0;
			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			System.out.println("Content has been copied from abc.txt to abc2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();

				if (fos != null)
					fos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// MyDate date=new MyDate(10, 8, 2020);

		// Employee employee=new Employee(102, "Shyam", 20000);
		/*
		 * WageEmployee employee=new WageEmployee(102, "Laxman", 20000, 10, 15000);
		 * 
		 * ObjectOutputStream oos=null;
		 * 
		 * try { oos=new ObjectOutputStream(new FileOutputStream("object.ser"));
		 * 
		 * oos.writeObject(employee); System.out.println(employee);
		 * 
		 * System.out.println("Serialization successful...!!!");
		 * 
		 * } catch (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */

	}
}