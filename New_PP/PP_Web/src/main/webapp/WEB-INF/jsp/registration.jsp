<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="registration_submit.do" modelAttribute="User">
<tr>
<form:errors path="email"> </form:errors>
<td>UserName</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<form:errors path="password"></form:errors>
<td>Password</td>
<td><form:input path="password"/></td>
</tr>

<tr>
<form:errors path="firstname"></form:errors>
<td>firstName</td>
<td><form:input path="firstname"/></td>
</tr>

<tr>
<form:errors path="lastname"></form:errors>
<td>lastName</td>
<td><form:input path="lastname"/></td>
</tr>

<tr>
<form:errors path="mobno"></form:errors>
<td>Mob.No</td>
<td><form:input path="mobno"/> </td>
</tr>

<tr>
<td><input type="submit" value="submit"></td>
</tr>

</form:form>


</form>
</body>
</html>