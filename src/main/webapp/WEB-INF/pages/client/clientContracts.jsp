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

<div class="p-0 bg-secondary h-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-dark text-center text-uppercase">Contract list</h1>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <table class="table table-light table-hover text-center m-2">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Contract</th>
                        <th scope="col">Tariff</th>
                        <th scope="col">Connected options</th>
                        <th scope="col">Change tafiff</th>
                        <th scope="col">Add options</th>
                        <th scope="col">Status</th>
                        <th scope="col">Block</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>1234567890</td>
                        <td>Tariff 1</td>
                        <td>Option 1, option 2, option 3</td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="clientTariffs.html">change
                                tariff</a>
                        </td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="clientOptions.html">add option</a>
                        </td>
                        <td class="text-uppercase table-danger">block</td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="#">unblock</a>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row">2
                            <br></th>
                        <td>0987654321</td>
                        <td>Tariff 2</td>
                        <td>Option 1, option 2, option 3</td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="clientTariffs.html">change
                                tariff</a>
                        </td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="clientOptions.html">add option</a>
                        </td>
                        <td class="text-uppercase table-success">active
                            <br></td>
                        <td>
                            <a class="btn btn-primary btn-block text-uppercase" href="#">block</a>
                        </td>
                    </tr>
                    </tbody>
                </table>
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