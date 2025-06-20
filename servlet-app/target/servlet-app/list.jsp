<!--list.jsp-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>


<html>
  <head>
    <title>THE LIST OF ALL PRODUCTS </title>
  </head>
  <body>
  <%@ include file="header.jsp" %>
  <h1> <u> THIS IS THE LIST OF ALL PRODUCTS</u> <h1>
    <ul>
      <c:forEach var="product" items="${products}">
         <li>${product.id}-${product.price}-${product.name}</li>
      </c:forEach> 
    </ul> 
  <%@ include file="footer.jsp" %>  
  </body>
</html>