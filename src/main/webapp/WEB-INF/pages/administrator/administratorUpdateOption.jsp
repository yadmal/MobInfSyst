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

<jsp:include page="administratorHeaderInclude.jsp"></jsp:include>

<div class="p-0 bg-secondary">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-dark text-center text-uppercase">update option</h1>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row justify-content-center">
            <div class="col-md-6 py-1">
                <form:form id="formUpdateOption" modelAttribute="updateOption" method="post" action="saveUpdatedOption">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <form:hidden path="id"/>
                            <label for="inputTitle">Title</label>
                            <form:input path="title" type="text" class="form-control" id="inputTitle"
                                        placeholder="Title"></form:input>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputDescription">Description</label>
                            <form:input path="description" type="text" class="form-control" id="inputDescription"
                                        placeholder="Description"></form:input>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputConnectionCost">Connection cost</label>
                            <form:input path="connectionCost" type="number" class="form-control"
                                        id="inputConnectionCost" placeholder="Connection cost"></form:input>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputPrice">Price</label>
                            <form:input path="price" type="number" class="form-control" id="inputPrice"
                                        placeholder="Price"></form:input>
                        </div>
                    </div>
                    <form:button value="submit"
                                 class="btn text-center text-uppercase btn-block btn-success">save</form:button>
                </form:form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="administratorFooterInclude.jsp"></jsp:include>

</body>

<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>--%>

<script src="<c:url value="/resources/js/jquery-3.3.1.min.map"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</html>