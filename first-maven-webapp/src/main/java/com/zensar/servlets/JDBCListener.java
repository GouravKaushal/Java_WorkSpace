package com.zensar.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zensar.connectionprovider.ConnectionProvider;


public class JDBCListener implements ServletContextListener {

	String driver = null;
	String url = null;
	String username = null;
	String password = null;
	Connection connection = null;

    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent event)  { 
    	ServletContext servletContext=event.getServletContext();
    	
    	driver = servletContext.getInitParameter("driver");
		url = servletContext.getInitParameter("url");
		username = servletContext.getInitParameter("username");
		password = servletContext.getInitParameter("password");
		
		connection=ConnectionProvider.getConnection(driver,url,username,password);
	
		servletContext.setAttribute("connection", connection);
		
		
	
    }
	
}
