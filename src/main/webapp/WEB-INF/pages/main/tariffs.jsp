<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Starter Template for Bootstrap 4.1.1</title>
    <link rel="shortcut icon" href="">
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">--%>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap-theme.min.css">--%>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/> ">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-grid.min.css"/> ">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-reboot.min.css"/> ">
    <style>
        body {
            padding-top: 50px;
        }

        .starter-template {
            padding: 40px 15px;
            text-align: center;
        }
    </style>
    <!--[if IE]>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="bg-dark border-secondary">

<jsp:include page="mainHeaderInclude.jsp"></jsp:include>

<div class="p-5 bg-secondary">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-dark text-center text-uppercase">list of tariffs</h1>
            </div>
        </div>
        <div class="row">
            <c:if test="${!empty tariffList}">
                <c:forEach items="${tariffList}" var="tariff" varStatus="count">
                    <div class="p-3 align-self-center col-md-4">
                        <div class="card">
                            <div class="card-block p-5">
                                <h4><c:out value="${tariff.title}"/></h4>
                                <hr>
                                <p><c:out value="${tariff.description}"/></p>
                                <c:if test="${!empty tariff.availableOptions}">
                                    <hr>
                                    <p>Connected options:</p>
                                    <c:forEach items="${tariff.availableOptions}" var="option">
                                        <p><c:out value="${option.title}"/></p>
                                    </c:forEach>
                                </c:if>
                                <hr>
                                <h3>
                                    Price $: <c:out value="${tariff.price}"/>
                                </h3>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </c:if>
        </div>
    </div>
</div>

<jsp:include page="mainFooterInclude.jsp"></jsp:include>

</body>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>--%>

<script src="<c:url value="/resources/js/jquery-3.3.1.min.map"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</html>