package com.zensar.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		PrintWriter writer =resp.getWriter();

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
					
					
					/*
					 * HttpSession httpSession=req.getSession(); httpSession.setAttribute("user",
					 * user);
					 */
					/*
					 * Cookie cookies=new Cookie("user", user); resp.addCookie(cookies);
					 * cookies.setMaxAge(10000);
					 */
					
					/*
					 * dispatcher=req.getRequestDispatcher("success.jsp"); req.setAttribute("user",
					 * user); dispatcher.forward(req, resp);
					 */
					
					writer.println("Hello "+user);
					writer.println("<form action='next>");
					writer.println("<input type=submit value =send>");
					writer.println("<input type=submit value=send>");
				} else {
					resp.sendRedirect("error.html");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}
	}

