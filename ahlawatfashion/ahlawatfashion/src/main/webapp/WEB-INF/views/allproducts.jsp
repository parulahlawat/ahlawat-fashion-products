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
 <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>productId</th>
      <th>name</th>
      <th>price</th>
      <th>imageURL</th>
      <th>viewMore </th>
      </tr>
    </thead>
    <tbody>
      <tr>
       <c:forEach items="${products}" var="product">
      <td>${product.productId}</td>
       <td>${product.name}</td>
     <td>${product.price}</td>
        <td><img class="img-thumbnail" style="width:80px;height:50px;" src="<c:url value="/resources/images/${product.productId}.jpg" /> " /> </td>
<td>
<a href="viewProduct/${product.productId}"> 
<span class="glyphicon glyphicon-info-sign">
</span>
</a>
</td>
</tr>
     
    </tbody>
    </c:forEach>
  </table>
  </div>
  <br><br><br>
<%@ include file ="template/Footer.jsp" %>
</body>
</html>