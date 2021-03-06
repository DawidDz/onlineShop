<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title>Add product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/theme/css/add-discovery-form.css">
</head>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container-fluid">

</div>
<!-- /.container-fluid -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between">
        <h1 class="h3 mb-0 text-gray-800">Add product</h1>
        <a href="<c:url value="/logouted"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Logout</a>
    </div>
    <form:form action="add" method="post" modelAttribute="product" class="discovery-form">
        <input name="name" placeholder="Product name" type="text"/>
        <input name="price" placeholder="Price" type="text"/>
        <input name="quantity" placeholder="Quantity" type="text"/>
        <input name="newLimitedProduct" placeholder="Is new limited product? Write: true or false" type="text"/>
        <input name="category" placeholder="Category id" type="text"/>
        <input type="submit" value="Send" class="discovery-form-button">
    </form:form>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>