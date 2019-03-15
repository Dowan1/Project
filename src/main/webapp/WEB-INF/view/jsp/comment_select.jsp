<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.*" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${result }" var="comment">
	번호 : ${comment.commentNo}<br>
	아이디 : ${comment.userId}<br>
	작성일시 : ${comment.regDate}<br>
	내용 : ${comment.commentContent}<br><br>
	</c:forEach>
</body>
</html>