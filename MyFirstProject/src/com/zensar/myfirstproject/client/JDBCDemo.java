package com.zensar.myfirstproject.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		try (Connection connection = ConnectionProvider.getConnection();
				Statement smt = connection.createStatement();) {

			System.out.println("Connected..!!!");

			 rs = smt.executeQuery("Select * from employee");
			 rsmd=rs.getMetaData();
			 System.out.println(rsmd.getColumnCount());
			 
			 

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
