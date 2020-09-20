
<%@ page import="java.util.*" contentType="text/html; charset=ISO-8859-1" %>
<%@ page  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>JSP Login Page</h2>
<%
	String user=request.getParameter("textUser");
	String password=request.getParameter("textPassword");
	
	if(user.equals("zensar")&&password.equals("zensar"))
	{
		out.println("<h2>Success</h2>");
		Date date =new Date();
		out.println("Date is : "+date);
	}
	else{
		out.println("<h2>Failed</h2>");
	}

	session.setAttribute("user", user);
	


%>

</body>
</html>