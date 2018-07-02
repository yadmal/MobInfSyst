<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Document</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../css/main.css" />
</head>

<body>
    <div class="container">
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ///////////////////////////////////HEADER//////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="header">
            <div class="logo">
                <p>Yadmal</p>
                <p>Systems</p>
            </div>
            <div class="userHeaderInfo">
                <p>AdminName</p>
                <p>AdminSurename</p>
                <form action="">
                    <input type="submit" name="submit" value="Exit">
                </form>
            </div>
        </div>
        <div class="menu">
            <ul>
                <li><a href="admin_add_options.html">Add New Option</a></li>
                <li><a href="admin_add_tariff.html">Add New Tariff</a></li>
                <li><a href="admin_edit_options.html">Edit Option</a></li>
                <li><a href="admin_edit_tariff.html">Edit Tariff</a></li>
            </ul>
        </div>
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////CONTENT//////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="content">
            <h1>ADD NEW OPTION</h1>


            <form:form id="formCreate" modelAttribute="newOption" method="post" action="submit">
                <form:input path=""
            </form:form>




            <form action="">
            <p>Option title:</p>
            <input type="text" name="optionTitle" placeholder="Option">
            <p>Option price:</p>
            <input type="number" name="optionPrice" placeholder="Option price">
            <p>Option connection cost:</p>
            <input type="number" name="optionConnectionCost" placeholder="Option connection cost">
            <input type="submit" name="addOption" value="Save">
            </form>

            <table>
                <tr>
                    <th>id</th>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Connection cost</th>
                </tr>
                <c:forEach items="${list}" var="item">
                    <tr>
                        <td><c:out value="${item.id}"/></td>
                        <td><c:out value="${item.title}"/></td>
                        <td><c:out value="${item.description}"/></td>
                        <td><c:out value="${item.price}"/></td>
                        <td><c:out value="${item.connectionCost}"/></td>
                    </tr>
                </c:forEach>

            </table>
        </div>



        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <!--   ////////////////////////////////////FOOTER///////////////////////////////////////////    -->
        <!--   /////////////////////////////////////////////////////////////////////////////////////    -->
        <div class="footer">
        </div>
    </div>
</body>

</html>
