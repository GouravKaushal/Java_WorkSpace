package com.zensar.servletsdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private static Connection connection = null;

	public static Connection getConnection() {
		try {

			Properties properties=new Properties();
			try {
				properties.load(new FileReader("E:\\Zensar_Training\\Java_WorkSpace\\first-web-application\\WebContent\\WEB-INF\\classes\\db.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			String driver = properties.getProperty("driver");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);

			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); connection =
			 * DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining",
			 * "root", "12345");
			 */
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
