<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="">
    <div class="container-fluid">
        <div class="row">
            <a class="col-md-3 text-center text-uppercase align-self-center" style="display:block; text-decoration: none;" href="<c:url value="/client/index"/>">
                <div>
                    <h1 class="text-light bg-secondary">YADMAL
                        <br>SYSTEMS</h1>
                </div>
            </a>
            <div class="col-md-3"></div>
            <div class="col-md-3"></div>
            <div class="col-md-3 border-secondary text-center">
                <form id="logoutForm" class="text-center text-light border" method="post" action="${contextPath}/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <div class="form-group row">
                        <label for="staticName" class="col-form-label col-sm-6 col-4 text-center">Name:</label>
                        <div class="col-sm-6 col-4">
                            <input type="text" readonly="" class="form-control-plaintext text-light text-center"
                                   id="staticName" value="${pageContext.request.userPrincipal.name}"></div>
                    </div>
                </form>
                <a class="btn btn-sm btn-block btn-warning" onclick="document.forms['logoutForm'].submit()">Logout</a>
            </div>
        </div>
    </div>
</div>
<div class="">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 py-2">
                <ul class="nav nav-pills justify-content-around bg-dark text-light py-3">
                    <li class="nav-item text-uppercase text-light">
                        <a class="nav-link text-light" href="/">my contracts
                            <br> </a>
                    </li>
                    <li class="nav-item text-uppercase text-light">
                        <a class="nav-link text-light" href="clientTariffs.html">tariffs
                            <br> </a>
                    </li>
                    <li class="nav-item text-uppercase text-light">
                        <a class="nav-link text-light" href="clientOptions.html">options
                            <br> </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="row bg-secondary m-1"> </div>
    </div>
</div>