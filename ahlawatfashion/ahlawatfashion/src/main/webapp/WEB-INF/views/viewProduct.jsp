<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@  include file="template/Header.jsp" %>
<div class ="container" ng-app="cartApp">
<div class ="row">
<div class ="col-md-5">
<img class="img-thumbnail" style="width:300px;height:200px;" src="<c:url value="/resources/images/${product.productId}.jpg "/> " >
</div>
<div class ="col-md-5">
<h1>${product.name}</h1>
<p>${product.description}</p>
<p><strong>name:</strong>${product.name}</p>
<p><strong>quantity:</strong>${product.quantity}</p>
<p><strong>price:</strong>${product.price}</p>
 <c:set var = "role" scope="page" value="${param.role}" />
                    <c:set var = "url" scope="page" value="/product/productList/all" />
                    <c:if test="${role='admin'}">
                        <c:set var="url" scope="page" value="/admin/productInventory" />
                    </c:if>

                    <p ng-controller="cartCtrl">
                        <a href="<c:url value = "${url}" />" class="btn btn-default">Back</a>
                        <a href="#" class="btn btn-warning btn-large" ng-click="addToCart('${productId}')"><span class="glyphicon glyphicon-shopping-cart"></span> Order Now</a>
                        <a href="<c:url value="/customer/cart" />" class="btn btn-default"><span class="glyphicon glyphicon-hand-right"></span> View Cart</a>
                    </p>

</div>
</div>
</div>
<script src="<c:url value="/resources/js/controller.js" /> " />
<br><br><br>
<%@ include file ="template/Footer.jsp" %>
</body>
</html>