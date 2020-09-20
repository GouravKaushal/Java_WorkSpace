package com.zensar.student_management.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// JDBC Related Attributes
	private String driver = null;
	private String url = null;
	private String username = null;
	private String password = null;
	private Connection connection = null;
	private ResultSet rs = null, rs2 = null, rs3 = null;
	private PreparedStatement psmt = null, psmt2 = null, psmt3 = null;
	private ServletContext servletContext = null;

	// Login Form Related Attributes
	private String email = null;
	private String loginPassword = null;
	private String firstName = null;
	private String lastName = null;
	private String contact = null;
	private String date;
	private String gender = null;
	private String hobbies = "";
	private String technologies = "";
	private String address = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletContext = config.getServletContext();

		driver = servletContext.getInitParameter("driver");
		url = servletContext.getInitParameter("url");
		username = servletContext.getInitParameter("username");
		password = servletContext.getInitParameter("password");

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected init from login do get");

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			psmt = connection.prepareStatement("Select * from studentdetails where email=? and password=?;");
			email = request.getParameter("textUser");
			loginPassword = request.getParameter("textPassword");
			psmt.setString(1, email);
			psmt.setString(2, loginPassword);
			rs = psmt.executeQuery();
			int id = 0;
			if (rs.next()) {
				// response.sendRedirect("success1.jsp");

				firstName = rs.getString("firstname");
				lastName = rs.getString("lastname");
				contact = rs.getString("contact");
				date = rs.getString("dob");
				gender = rs.getString("gender");
				address = rs.getString("address");
				id = rs.getInt("id");

				psmt2 = connection.prepareStatement("select hobby from hobbies where student_id=?;");
				psmt2.setInt(1, id);
				rs2 = psmt2.executeQuery();
				hobbies="";
				while (rs2.next()) {
					hobbies = hobbies.concat(rs2.getString(1) + ", ");
				}

				psmt3 = connection.prepareStatement("select technology from technologies where student_id=?;");
				psmt3.setInt(1, id);
				rs3 = psmt3.executeQuery();
				technologies="";
				while (rs3.next()) {
					technologies = technologies.concat(rs3.getString(1) + ",");
				}
				System.out.println(hobbies);
				System.out.println(technologies);

				RequestDispatcher dispatcher = request.getRequestDispatcher("success1.jsp");
				
				request.setAttribute("firstName",firstName);
				request.setAttribute("lastName",lastName);
				request.setAttribute("email",email);
				request.setAttribute("contact",contact);
				request.setAttribute("date",date);
				request.setAttribute("gender",gender);
				request.setAttribute("address",address);
				request.setAttribute("hobbies",hobbies);
				request.setAttribute("technologies",technologies);
				
				
				dispatcher.forward(request, response);

			} else {
				response.sendRedirect("error2.html");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
