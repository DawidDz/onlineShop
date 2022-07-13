<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Error</title>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container-fluid">

</div>
<!-- /.container-fluid -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-xl-between">
        <h1 class="h3 mb-0 text-gray-600">Error</h1>
        <a href="<c:url value="/"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Home page</a>
        <a href="<c:url value="/logouted"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Logout</a>
    </div>
    <br>
    <br>
    <img src='<c:url value="/theme/img/danger.png"></c:url>' width="350" height="350" class="center"/>
    <br>
    <br>
    <br>
    <br>
    <p class="center bg-danger">Error. Invalid data.</p>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>