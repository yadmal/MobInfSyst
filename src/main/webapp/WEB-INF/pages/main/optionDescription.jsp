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

<body class="bg-dark border-light">
<jsp:include page="mainHeaderInclude.jsp"></jsp:include>

<div class="py-5 bg-secondary">
    <div class="container">
        <div class="row text-light">
            <div class="col-md-7 align-self-center">
                <h3>Align center text with image</h3>
                <p class="my-3">Flex setting of this column. Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                    sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
                    nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                    commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
                    fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia
                    deserunt mollit anim id est laborum.</p>
            </div>
            <div class="col-md-5">
                <img class="img-fluid d-block" src="https://pingendo.com/assets/photos/wireframe/photo-1.jpg"></div>
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