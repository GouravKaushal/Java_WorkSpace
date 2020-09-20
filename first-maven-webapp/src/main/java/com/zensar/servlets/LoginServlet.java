package com.zensar.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.connectionprovider.ConnectionProvider;

public class LoginServlet extends HttpServlet {

	ResultSet rs = null;
	ResultSetMetaData rsmd = null;
	Statement smt = null;
	PreparedStatement psmt = null;
	//ServletConfig servletConfig = null;
	ServletContext servletContext=null;
	Connection connection=null;

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletContext=config.getServletContext();

		connection=(Connection) servletContext.getAttribute("connection");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String user = req.getParameter("textUser");
		String pass = req.getParameter("textPassword");
		System.out.println("Servlet is Calling");

		// ServletConfig config = getServletConfig();

		// ServletContext context = getServletContext();

		/*
		 * String driver = context.getInitParameter("driver"); String url =
		 * context.getInitParameter("url"); String username =
		 * context.getInitParameter("username"); String password =
		 * context.getInitParameter("password");
		 */
			
			
			try {
				
				psmt = connection.prepareStatement("Select * from loginDetails where username=? and password=?;");

				psmt.setString(1, user);
				psmt.setString(2, pass);
				rs = psmt.executeQuery();

				RequestDispatcher dispatcher = null;

				if (rs.next()) {
					dispatcher = req.getRequestDispatcher("success.html");
					// dispatcher.forward(req, resp);
					// dispatcher.include(req, resp);
					resp.sendRedirect("success.html");
					// resp.getWriter().println("<h2>Welcome...!!!!! Authentication
					// Successfull</h2>");

				} else {
					dispatcher = req.getRequestDispatcher("error.html");
					// dispatcher.forward(req, resp);
					// dispatcher.include(req, resp);
					resp.sendRedirect("error.html");

					// resp.getWriter().println("<h2>Sorry..!! Authentication Unsuccessfull</h2>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}
	}

