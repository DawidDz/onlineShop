<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<title>Logouted</title>
<%@ include file="/WEB-INF/views/header2.jsp" %>
<div class="container-fluid">

</div>
<!-- /.container-fluid -->
<div class="container-fluid">
    <div class="d-sm-flex align-items-center justify-content-end">
        <br>
        <br>
        <br>
        <br>
        <a href="<c:url value="/login"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Login</a>
    </div>
    <br>
    <br>
    <img src='<c:url value="/theme/img/sad.png"></c:url>' width="350" height="350" class="center"/>
    <br>
    <br>
    <br>
    <br>
    <p class="text-center col-red">See you again...</p>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>