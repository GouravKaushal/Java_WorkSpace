package com.zensar.myfirstproject.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject1 {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		Object emp = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));

			try {
				emp = ois.readObject();

				System.out.println(emp);

				System.out.println("Deserialization successfull..!!!! ");

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
