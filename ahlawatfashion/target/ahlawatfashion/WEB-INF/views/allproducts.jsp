<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
<%@  include file="template/Header.jsp" %>
<table>
<tr>
      <th>productId</th>
      <th>name</th>
      <th>price</th>
      <th>imageURL</th>
    </tr>
<c:forEach items="${products}" var="product">
<tr>
      <td>${products.productId}</td>
      <td>${products.name}</td>
       <td>${products.price}</td>
       <!--  <td> img src "<c:url value="/resources/images/${products.imageURL}.jpg"/> " </td>-->
<li>${product.name}</li>
</tr>
</c:forEach>
</table>
<%@ include file ="template/Footer.jsp" %>
</body>
</html>