<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring JPA Diagram Editor</title>
	</head>
	<body>
		<div align="center">
			<h1>JPA Diagram Editor Implementation</h1>
		</div>
		<div align="center">
			<h2>User Table</h2>
			<table border="1">
				<tr>
					<td>Sl.</td>
					<td>User Id</td>
					<td>Username</td>
					<td>Email</td>
				</tr> 
				<c:forEach var="user" items="${userList}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${user.userid}</td>
						<td>${user.username}</td>
						<td>${user.email}</td>
					</tr>
				</c:forEach>             
			</table>
		</div>
		<div align="center">
			<h2>Role Table</h2>
			<table border="1">
				<tr>
					<td>Sl.</td>
					<td>Role Id</td>
					<td>Role Name</td>
				</tr> 
				<c:forEach var="role" items="${roleList}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${role.roleid}</td>
						<td>${role.rolename}</td>
					</tr>
				</c:forEach>             
			</table>
		</div>
	</body>
</html>