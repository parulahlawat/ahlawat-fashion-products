<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@  include file="template/Header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Edit Product</h1>


            
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/product/editProduct"
                   method="post" commandName="product">

         <form:hidden path="productId" value="${product.productId}" />

            <div class="form-group">
                <label for="name">Name</label>
                <form:errors path="name" cssStyle="color:#ff0000;" />
                <form:input path="name" id="name" class="form-Control" value="${product.name}"/>
            </div>

            <div class="form-group">
                <label for="price">Price</label>
                <form:errors path="price" cssStyle="color:#ff0000;" />
                <form:input path="price" id="price" class="form-Control" value="${product.price}" />
            </div>
             <div class="form-group">
                <label for="description">Description</label>
                <form:textarea path="description" id="description" class="form-Control" />
            </div>
            
            

           
            <div class="form-group">
                <label for="quantity">Quantity</label>
                <form:errors path="quantity" cssStyle="color:#ff0000;" />
                <form:input path="quantity" id="quantity" class="form-Control" value="${product.quantity}"/>
            </div>


            <div class="form-group">
                <label class="control-label" for="imageURL">Upload Picture</label>
                <form:input id="imageURL" path="imageURL" type="file" class="form:input-large" />
            </div>

            <br/><br/>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory" />" class="btn btn-default">Cancel</a>

        </form:form>
         <%@ include file ="template/Footer.jsp" %>
</body>
</html>