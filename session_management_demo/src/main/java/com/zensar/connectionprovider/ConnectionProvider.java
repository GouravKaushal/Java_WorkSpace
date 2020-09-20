package com.zensar.connectionprovider;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

public class ConnectionProvider extends HttpServlet{
	private static Connection connection = null;
	public static Connection getConnection(String driver,String url,String username,String password) {
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
