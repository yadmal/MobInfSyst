<div class="">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 text-center text-uppercase align-self-center">
                <h1 class="text-light bg-secondary">YADMAL
                    <br>SYSTEMS</h1>
            </div>
            <div class="col-md-3"></div>
            <div class="col-md-3"></div>
            <div class="col-md-3">
                <form method="POST" action="${contextPath}/login" class="form-signin">
                    <div class="form-group">
                        <span>${message}</span>
                        <input name="username" type="text" class="form-control" placeholder="Username"
                               autofocus="true"/>
                    <div class="form-group">
                        <input name="password" type="password" class="form-control" placeholder="Password"/>
                        <span>${error}</span>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                        <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                        <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>

                    <%--<div class="form-group">--%>
                        <%--<label class="text-light">Email address</label>--%>
                        <%--<input type="username" class="form-control" placeholder="Enter username"></div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class="text-light">Password</label>--%>
                        <%--<input type="username" class="form-control" placeholder="Password"></div>--%>
                    <%--<button type="submit" class="btn btn-success">Submit</button>--%>
                </form>
            </div>
        </div>
    </div>
</div>