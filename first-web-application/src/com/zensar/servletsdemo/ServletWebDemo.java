package com.zensar.servletsdemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWebDemo extends HttpServlet {

	Connection connection = null;
	ResultSet rs = null;
	ResultSetMetaData rsmd = null;
	Statement smt = null;
	PreparedStatement psmt = null;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<h3>Hello</h3>");
	}

	
	@Override
	public void init() throws ServletException {
		connection = ConnectionProvider.getConnection();
	}
	/*
	 * public Properties getProperties() { Properties properties = new Properties();
	 * try { properties.load(getServletContext().getResourceAsStream(
	 * "/WEB-INF/properties/db.properties")); return properties; } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * return properties; }
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String user = req.getParameter("textUser");
		String pass = req.getParameter("textPassword");
		

		try {

			
			psmt = connection.prepareStatement("Select * from loginDetails where username=? and password=?;");

			psmt.setString(1, user);
			psmt.setString(2, pass);
			rs = psmt.executeQuery();

			if (rs.next()) {
				resp.getWriter().println("<h2>Welcome...!!!!!  Authentication Successfull</h2>");
			} else {
				resp.getWriter().println("<h2>Sorry..!! Authentication Unsuccessfull</h2>");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
		 * resp) throws ServletException, IOException { String name =
		 * req.getParameter("name"); PrintWriter writer = resp.getWriter();
		 * 
		 * Enumeration<String> headerNames = req.getHeaderNames();
		 * while(headerNames.hasMoreElements()) { String element =
		 * headerNames.nextElement();
		 * writer.println(element+" : "+req.getHeader(element)); }
		 * 
		 * writer.print("<html>"); writer.print("<body>");
		 * writer.print("<h3>Hello "+name+"..!!!!</h3>");
		 * 
		 * writer.print("</body>"); writer.print("</html>");
		 */
	}
}
