<!--form.jsp-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
 <title> Add A new Product </title>
</head>
<body>
  <%@include file="header.jsp" %>
  <form action="products" method="post" target="_blank">
   <label for="price"> Add Price </label>
   <input type="text" name="price" id="price"><br>
   <label for="product"> Add product </label>
   <input type="text" name="product" id="product"><br>
   <input type="submit" value="Add new product">
  </form>
  <%@ include file="footer.jsp" %>
  </body>
 </html>
  

