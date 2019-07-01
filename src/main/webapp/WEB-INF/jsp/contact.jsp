<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Spring Boot</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
    <h1>Spring Boot - Contact Form</h1>
    <form:form modelAttribute="contact" action="/contact" method="post">
        <form:hidden path="contactId" />

        <div>
            <label>First Name</label>
            <form:input path="firstName" />
        </div>
        <div>
            <label>Last Name</label>
            <form:input path="lastName" />
        </div>
        <button>Submit</button>
    </form:form>
</body>
</html>