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

<jsp:include page="clientHeaderInclude.jsp"></jsp:include>

<div class="bg-secondary text-white h-100">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-dark text-center text-uppercase">Tariffs</h1>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <ul class="list-unstyled">
                    <li>Current number: 0123456789</li>
                    <li>Current tariff: tariff 1</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <p class="lead">Available tariffs:</p>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row text-dark">
            <div class="p-3 align-self-center col-md-4">
                <div class="card">
                    <div class="card-block p-5">
                        <h1>
                            <sup>$</sup> 25 </h1>
                        <h3>Standard</h3>
                        <hr>
                        <p>Available options:</p>
                        <a href="#" class="btn btn-dark">Change</a>
                    </div>
                </div>
            </div>
            <div class="p-3 align-self-center col-md-4">
                <div class="card">
                    <div class="card-block p-5">
                        <h1>
                            <sup>$</sup> 25 </h1>
                        <h3>Standard</h3>
                        <hr>
                        <p>Available options:</p>
                        <a href="#" class="btn btn-dark">Change</a>
                    </div>
                </div>
            </div>
            <div class="p-3 align-self-center col-md-4">
                <div class="card">
                    <div class="card-block p-5">
                        <h1>
                            <sup>$</sup> 25 </h1>
                        <h3>Standard</h3>
                        <hr>
                        <p>Available options:</p>
                        <a href="#" class="btn btn-dark">Change</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="clientFooterInclude.jsp"></jsp:include>

</body>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>--%>

<script src="<c:url value="/resources/js/jquery-3.3.1.min.map"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</html>