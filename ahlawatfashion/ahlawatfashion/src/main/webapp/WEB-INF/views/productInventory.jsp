<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@include file="template/Header.jsp" %>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<script>
    $(document).ready(function(){
        $('.table').DataTable({
            "lengthMenu": [[1,2,3,5,10, -1], [1,2,3,5,10, "All"]]
        });
    });
</script>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Welcome To Product Inventory Page</h1>
            <br><br>
        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
               
                <th>Product Name</th>
                <th>Description</th>
                <th>Quantity</th>
                <th>Price</th>
                 <th>Proto Thumb</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.name}</td>
                    <td>${product.description}</td>
                    <td>${product.quantity}</td>
                    <td>${product.price}</td>
                    <td><img class="img-thumbnail" style="width:80px;height:50px;" src="<c:url value="/resources/images/${product.productId}.jpg "/> " /> </td>
                    <td>
                        <a href="<spring:url value="/viewProduct/${product.productId}" />"><span class="glyphicon glyphicon-info-sign"></span></a>
                        <a href="<spring:url value="/admin/product/deleteProduct/${product.productId}" />"><span class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/product/editProduct/${product.productId}" />"><span class="glyphicon glyphicon-pencil"></span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
<br><br> 
        <a href="<spring:url value="/admin/product/addProduct" />" class="btn btn-primary">Add Product</a>

<%@include file="template/Footer.jsp" %>
