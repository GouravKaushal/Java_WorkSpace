package com.zensar.myfirstproject.client;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	private static Connection connection = null;

	public static Connection getConnection() {
		Properties properties = null;
		try {
			properties = new Properties();
			properties.load(new FileReader("db.properties"));

			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			String driver = properties.getProperty("driver");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

}
