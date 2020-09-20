package com.zensar.myfirstproject.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertSQLDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee ID : ");
		int id = sc.nextInt();

		System.out.println("Enter the Name : ");
		String name = sc.next();

		System.out.println("Enter the Salary : ");
		int salary = sc.nextInt();

		try (Connection connection = ConnectionProvider.getConnection();
				PreparedStatement psmt = connection.prepareStatement("insert into employee values (?,?,?)");) {

			System.out.println("Connected..!!!");

			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, salary);

			int count = psmt.executeUpdate();

			if (count > 0) {
				System.out.println("Record inserted Successfully...!!!!1");
			} else {
				System.out.println("Record not inserted ...!!!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
