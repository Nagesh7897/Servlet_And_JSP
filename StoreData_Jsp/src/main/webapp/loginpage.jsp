<%@page import="test.User"%>
<%@page import="test.Model"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
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
String name=request.getParameter("name");
String password=request.getParameter("pwd");
String address=request.getParameter("add");

List<Model> list=new LinkedList<Model>();
Model model=new Model();
model.setName(name);
model.setAddress(address);
model.setPassword(password);

list.add(model);


User.adddata(list);
System.out.println(User.returnData());

response.sendRedirect("Match.html");






//------------Below code is used to check name and passwards are correct or not by retyping on the same file---------
/* List<String> list= new LinkedList<String>();
list.add(name);
list.add(password);
list.add(address);

Model been=new Model();

System.out.println("Varify user name");
Scanner scanner=new Scanner(System.in);
String uname, pass;

uname=scanner.next();
if(uname.equals(name))
{
	System.out.println("Match");
}
else
{
	System.out.println("Enter Again");
	response.sendRedirect("index.html");
}

System.out.println("Varify user password");
pass=scanner.next();
if(pass.equals(password))
{
	System.out.println("Match");
}
else
{
	System.out.println("Enter Again");
	response.sendRedirect("index.html");
} */
%>
</body>
</html>