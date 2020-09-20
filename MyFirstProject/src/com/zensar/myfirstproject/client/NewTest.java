package com.zensar.myfirstproject.client;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) {

		/*
		 * try { Class.forName("com.mysql.cj.jdbc.Driver"); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { Connection connection =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining",
		 * "root", "12345"); PreparedStatement psmt =
		 * connection.prepareStatement("Insert into employee values (?,?,?);");
		 * 
		 * psmt.setInt(1, 1011); psmt.setString(2, "Bhoi"); psmt.setInt(3, 1563000);
		 * 
		 * int c=psmt.executeUpdate();
		 * 
		 * Statement smt = connection.createStatement(); ResultSet rs =
		 * smt.executeQuery("Select * from employee"); ResultSetMetaData rsmd =
		 * rs.getMetaData(); int count = rsmd.getColumnCount(); if (count > 0) { while
		 * (rs.next()) { System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
		 * rs.getInt(3)); } }
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any data : ");
		String s=sc.nextLine();
		
		
		try(FileWriter fw=new FileWriter("./resources/newfile.txt");
				FileReader fr=new FileReader("./resources/newfile.txt");
						FileWriter fw1=new FileWriter("./resources/newfile1.txt")) {
			
			fw.write(s);
			int ch=0;
			while((ch=fr.read())!=-1)
			{
				fw1.write(ch);
			}
			
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		

	}
}
