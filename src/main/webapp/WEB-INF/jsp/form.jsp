<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Spring Boot</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <h1>Spring Boot - Form</h1>
    <form action="/form" method="post">
        <input type="text" name="inputBox1" value="${inputBoxDefault}">
        <button>Submit</button>
    </form>
</body>
</html>