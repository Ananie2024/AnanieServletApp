<!--result.jsp-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>


<html>
  <head>
    <title> Product Added </title>
  </head>
  <body>
  <%@ include file="header.jsp" %>
    <h2> Product Added </h2>
    <p> ${message}  </p>
   
    <a href="form.jsp"> Add another product </a>
   <%@include file="footer.jsp" %>
  </body>
</html>