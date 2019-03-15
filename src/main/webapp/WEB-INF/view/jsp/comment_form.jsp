<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>comment_form</title>
</head>
<body>
	<form:form commandName="comment" action="comment_insert">
		<label><spring:message code="commentInsert" />:</label>
		<form:input path="commentNo"/><br>
		<label><spring:message code="userId" />:</label>
		<form:input path="userId"/><br>
		<label><spring:message code="commentContent" />:</label>
		<form:input path="commentContent" /><br>
		<input type="submit" value="<spring:message code="Insert.btn" />">
			<br />
	</form:form>
	
	
	<form:form commandName="comment" action="comment_select" >
	<label><spring:message code="commentSelect"/> : </label>
		<form:input path="commentNo" /><br>
			<input type="submit" value="<spring:message code="select.btn" />">
		<br />
	</form:form>
	
	<form:form commandName="comment" action="comment_delete" >
		<label><spring:message code="commentDelete"/> : </label>
		<form:input path="commentNo" /><br>
			<input type="submit" value="<spring:message code="Delete.btn" />">
		<br />
	</form:form>
</body>
</html>