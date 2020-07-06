<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 06/07/2020
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Translate</title>
</head>
<body>
<center>
	<h2>Translate</h2>
	<c:if test='${requestScope["text"] != null}'>
		<table border="1">
			<tbody>
				<tr>
					<td>EN</td>
					<td>${requestScope["text"]}</td>
				</tr>
				<tr>
					<td>VI</td>
					<td>${requestScope["translate"]}</td>
				</tr>
			</tbody>
		</table>
	</c:if>
	<br />
	<br />
	<form method="post">
		<input type="text" name="text" value='${requestScope["text"]}' /><br />
		<br />
		<input type="submit" value="Translate" />
	</form>
</center>
</body>
</html>
