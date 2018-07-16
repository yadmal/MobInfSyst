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

    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>

    <script type="text/javascript">
        function checkTitle(){
            $.ajax({
                url: '/admin/checkTitle',
                method: 'get',
                dataType: 'text',
                data: ({title: $('#inputTitle').val()}),
                success: function(data){
                    console.log(data);
                    $("#titleStatus").empty();
                    if(data == "true"){
                        console.log(data);
                        $("#titleStatus").append("Title is free");
                    } else{
                        $("#titleStatus").append("Title is already exists");
                    }
                }
            });
        }

    </script>
</head>

<body class="bg-dark border-secondary">

<jsp:include page="administratorHeaderInclude.jsp"></jsp:include>

<div class="p-0 bg-secondary">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-dark text-center text-uppercase">update tariff</h1>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row justify-content-center">
            <div class="col-md-6 py-1">
                <form:form id="formUpdateTariff" modelAttribute="updateTariff" method="post" action="saveUpdatedTariff">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <form:hidden path="id"/>
                            <%--<form:hidden path="AvailableOptions"/>--%>
                            <p id="titleStatus" style="color: red"></p>
                            <label for="inputTitle" >Title</label>
                            <form:input path="title" type="text" class="form-control" id="inputTitle"
                                        placeholder="Title" onkeyup="checkTitle()"></form:input>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputDescription">Description</label>
                            <form:input path="description" type="text" class="form-control" id="inputDescription"
                                        placeholder="Description"></form:input>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">

                            <div class="row">
                                <div class="col-md-12">
                                    <table class="table table-light table-hover text-center m-2">
                                        <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">Title</th>
                                            <th scope="col">Price</th>
                                            <th scope="col">Connection cost</th>
                                            <th scope="col">Description</th>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:if test="${!empty updateTariff.availableOptions}">
                                            <c:forEach items="${updateTariff.availableOptions}" var="option" varStatus="count">
                                                <tr>
                                                    <td scope="row">${count.count}</td>
                                                    <td>${option.title}</td>
                                                    <td>${option.price}</td>
                                                    <td>${option.connectionCost}</td>
                                                    <td>${option.description}</td>
                                                    <td>
                                                        <a class="btn btn-block text-uppercase btn-success"
                                                           href="<c:url value="/admin/updateOption/${option.id}"/>">edit</a>
                                                    </td>
                                                    <td>
                                                        <a class="btn btn-block text-uppercase btn-danger"
                                                           href="<c:url value="/admin/deleteOption/${option.id}"/>">delete</a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </c:if>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>

                            <%--<form:checkboxes items="${updateTariff.availableOptions}" path="availableOptions" itemLabel="optionsList" class="form-control"--%>
                                        <%--id="showAvailableOptions"></form:checkboxes>--%>

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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

<%--<script rel="script" type="text/javascript" src="<c:url value="/resources/js/jquery-3.3.1.min.map"/>"></script>--%>
<%--<script rel="script" type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>--%>

</html>