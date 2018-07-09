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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap-theme.min.css">
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
          <form class="">
            <div class="form-group">
              <label class="text-light">Email address</label>
              <input type="email" class="form-control" placeholder="Enter email"> </div>
            <div class="form-group">
              <label class="text-light">Password</label>
              <input type="password" class="form-control" placeholder="Password"> </div>
            <button type="submit" class="btn btn-success">Submit</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-12 py-2">
          <ul class="nav nav-pills justify-content-around bg-dark text-light py-4">
            <li class="nav-item text-uppercase text-light">
              <a class="nav-link text-light active" href="tariffs.html">tariffs</a>
            </li>
            <li class="nav-item text-uppercase text-light">
              <a href="options.html" class="nav-link text-light">options</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="p-5 bg-secondary">
    <div class="container">
      <div class="row">
        <div class="p-3 align-self-center col-md-4">
          <div class="card">
            <div class="card-block p-5">
              <h1>
                <sup>$</sup> 25 </h1>
              <h3>Standard</h3>
              <hr>
              <p>Perfect for small business and growing teams.&nbsp;</p>
              <a href="tariffDescription.html" class="btn btn-dark">Subscribe</a>
            </div>
          </div>
        </div>
        <div class="p-3 align-self-center col-md-4">
          <div class="card">
            <div class="card-block p-5">
              <h1>
                <sup>$</sup> 75 </h1>
              <h3>Premium</h3>
              <hr>
              <p>Use all the features and get the maximum out of the app</p>
              <a href="tariffDescription.html" class="btn btn-dark">Subscribe</a>
            </div>
          </div>
        </div>
        <div class="p-3 align-self-center col-md-4">
          <div class="card">
            <div class="card-block p-5">
              <h1>
                <sup>$</sup> 135 </h1>
              <h3>Pro</h3>
              <hr>
              <p>Get the whole pack and forget about everything else</p>
              <a href="tariffDescription.html" class="btn btn-dark">Subscribe</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bg-dark text-white p-3">
    <div class="container">
      <div class="row">
        <div class="col-md-6 text-center align-self-center">
          <p class="mb-5">
            <strong>Pingendo Inc.</strong>
            <br>795 Folsom Ave, Suite 600
            <br>San Francisco, CA 94107
            <br>
            <abbr title="Phone">P:</abbr> (123) 456-7890 </p>
          <div class="my-3 row">
            <div class="col-4">
              <a href="https://www.facebook.com" target="_blank">
                <i class="fa fa-3x fa-facebook"></i>
              </a>
            </div>
            <div class="col-4">
              <a href="https://twitter.com" target="_blank">
                <i class="fa fa-3x fa-twitter"></i>
              </a>
            </div>
            <div class="col-4">
              <a href="https://www.instagram.com" target="_blank">
                <i class="fa fa-3x fa-instagram"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-6 p-0"></div>
      </div>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 10px;right:10px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:250px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;
    <img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16">
  </pingendo>
</body>

</html>