<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<title>About us</title>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container-fluid">

</div>
<!-- /.container-fluid -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between">
        <h1 class="h3 mb-0 text-gray-800">About us</h1>
        <a href="<c:url value="/"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Logout</a>
    </div>
    <img src='<c:url value="/theme/img/shop.png"></c:url>' width="300" height="300" class="center"/>
    <br>
    <br>
    <p class="center bg-greener justify">We have been on the market for 20 years.
        We were established to be unrivaled on the market in terms of price,
        while selling good quality products. We invite you to visit us for shopping <i class="fa fa-laugh-beam sidebar-brand-icon rotate-n-15"></i></p>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>