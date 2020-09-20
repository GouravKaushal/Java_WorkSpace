package com.zensar.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {

	public boolean isValiduser(String username,String password) {
		PreparedStatement psmt=null;
		Connection con=null;
		ResultSet rs=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "12345");
			psmt=con.prepareStatement("Select * from logindetails where username=? and password=?;");
			psmt.setString(1, username);
			psmt.setString(2, password);
			rs=psmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		
		} catch (SQLException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false; 
		
	}
}
