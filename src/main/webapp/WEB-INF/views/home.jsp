<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<title>Home</title>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container-fluid">

</div>
<!-- /.container-fluid -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between">
        <h1 class="h3 mb-0 text-gray-800">List of products</h1>
        <a href="<c:url value="/"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Add product</a>
        <a href="<c:url value="/logouted"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Logout</a>
    </div>
    <br>
<p class="text-center">dassssssssssss</p>
    </div>
<%@ include file="/WEB-INF/views/footer.jsp" %>