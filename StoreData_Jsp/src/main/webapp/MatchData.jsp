<%@page import="test.User"%>
<%@page import="test.Model"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String cname=request.getParameter("name");
String cpassword=request.getParameter("password");
List<Model> list=new LinkedList();

list=User.returnData();

for (Model str:list)
{
	if(cname.equals(str.getName()) &&  cpassword.equals(str.getPassword()))
	{
	//	out.println("Match Found");
		response.sendRedirect("Successful.html");
	}
	else
	{
		out.println("Match Not Found");
		response.sendRedirect("index.html");
	}
}

%>
</body>
</html>