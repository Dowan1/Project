<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,Model.*" %>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<select id="bca" name="bnum" 
			onchange="bcar2(this.value)" >
<% for(Object o : list) { 
	Bcar bcar = (Bcar)o;
%>
	<option value="<%= bcar.getBnum() %>"><%= bcar.getBname() %></option>
<% } %>
</select>
</body>
</html>